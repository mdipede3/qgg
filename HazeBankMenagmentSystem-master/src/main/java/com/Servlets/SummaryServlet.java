/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;

import com.Models.CreditCalculator;
import com.domain.CreditCalculatorApplication.Credit;
import com.domain.CreditCalculatorApplication.Data;
import com.domain.CreditCalculatorApplication.Instalment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Patryk
 */
@WebServlet ("/summary")
public class SummaryServlet extends HttpServlet {
    private List<String> data = new ArrayList<String>();
    private CreditCalculator creditCalculator = new CreditCalculator();
    private List<Instalment> resultList = new ArrayList<Instalment>();
    public void doPost (HttpServletRequest request , HttpServletResponse response ) throws IOException, ServletException{

        data.clear();
        resultList.clear();
        data.add(request.getParameter("summaryCredit"));
        data.add(request.getParameter("stock"));
        data.add(request.getParameter("percentCredit"));
        data.add(request.getParameter("constantFee"));
        data.add(request.getParameter("select"));
        data.add(request.getParameter("getPdf"));
        buildView(response,request);
    }
    public void buildView (HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException{
        creditCalculator.setData(data);
        if (!creditCalculator.init()){
           response.sendRedirect("errorMessage");
           return;
        }
       resultList = creditCalculator.getResultList();
       if (!creditCalculator.getCredit().isHadPdf().equals("Get Pdf")){
           responseHTML(response);
           }
       else {
           responsePDF(response,request);
       }
         }
    public void responseHTML (HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
       response.getWriter().print (
              "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
              +"<link rel='stylesheet' type='text/css' href='CSS/style.min.css'>"
              +"<header>"
              +"<p class='logo'><img src='Image/coin.png' class='logo_coin_size' alt='logo coin'></img>HazeBank Credit</p>"
              +"</header>"
              +"<main class='app_table_contener' >"
              +"<div class='app_table_button_contener'>"
              +"<p class='app_table_button_row'><a href='index.jsp' class='app_button'><img class='logo_coin_size' src='Image/button_back.png'></img></a></p><p class='app_table_button_row'>Powrót</p>"
              +"</div>"
              + "<table class='app_table'>"
              + "<tbody>"
              + "<tr>"
              +"<th> Numer Raty </th>"
              +"<th> Czeœæ kapita³owa </th>"
              +"<th> Czeœæ odsetkowa</th>"
              +"<th> Op³ata sta³a </th>"
              +"<th> Wysokoœæ raty</th>"
              +"</tr>"
              +"</main>"
       );
       for (Instalment element : resultList){

           response.getWriter().print(
              "<tr>"
              +"<td class='app_result_cell'>"+element.getId()+"</td>"
              +"<td class='app_result_cell'>"+element.getPartCapital()+"</td>"
              +"<td class='app_result_cell'>"+element.getPartInterest()+"</td>"
              +"<td class='app_result_cell'>"+element.getPartConstantFee()+"</td>"
              +"<td class='app_result_cell'>"+element.getFinalInterest()+"</td>"
              +"</tr>"
           );

       }
         response.getWriter().print(
                    "</tbody>"
                    +"</table>" );
    }
    	private void responsePDF(HttpServletResponse response, HttpServletRequest request) throws ServletException,
			IOException {

		String pdfFileName = "raport.pdf";
		String contextPath = getServletContext().getRealPath("raport.pdf");
                creditCalculator.setLinkToFilePDF(contextPath);
                creditCalculator.runPdfBuilder();


		File pdfFile = new File(contextPath);
		response.setContentType("application/pdf");
                response.setCharacterEncoding("UTF-8");
		response.addHeader("Content-Disposition", "attachment; filename=" + pdfFileName);
		response.setContentLength((int) pdfFile.length());

		FileInputStream fileInputStream = new FileInputStream(pdfFile);
		OutputStream responseOutputStream = response.getOutputStream();
		int bytes;
		while ((bytes = fileInputStream.read()) != -1) {
			responseOutputStream.write(bytes);
		}

	}
}

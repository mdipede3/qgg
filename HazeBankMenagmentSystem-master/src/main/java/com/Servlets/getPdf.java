/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Patryk
 */
@WebServlet ("pdf")
public class getPdf extends HttpServlet {
    
    
    public void doPost ( HttpServletResponse response ,HttpServletRequest request ) throws IOException{
       String raport = request.getParameter("raport");
       response.getWriter().print(raport);
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Models.Services;

import com.domain.CreditCalculatorApplication.Instalment;
import com.domain.CreditCalculatorApplication.Row;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Patryk
 */
public class PdfBuilderService {
    
    private List<Instalment> resultList =  new ArrayList<Instalment>();
    private String fileName;
    private String path;
    private PdfWriter writer;
    private PdfDocument pdf;
    private RowsBuilderService rowsBuilderService = new RowsBuilderService ();
    private Table table = new Table (new float[]{1,1,1,1,1});
    private Document document;
    
    
      public void constructPdfFile() throws FileNotFoundException, IOException {
      generateFileName ();
      runPdfAPI();
      flushContent();
      writeDocument();
    }
      
      private void generateFileName (){
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date = new Date();
      String FileName = "Raport" + dateFormat.format(date);
          
      }
      private void runPdfAPI () throws FileNotFoundException{
          writer = new PdfWriter(path);
          pdf = new PdfDocument(writer);
          document = new Document(pdf);
          
      
      }
      private void writeDocument () throws IOException{
      document.setMargins(20, 20, 20, 20);
      table.setWidthPercent(100);
      document.setFont(adjustFont());
      setResultToRow();
      List<Row> rows = rowsBuilderService.getRows();
      setRowToTable(rows);
      document.add(table);
      document.close();
      
      }
      private PdfFont adjustFont () throws IOException{
          return PdfFontFactory.createFont(FontConstants.COURIER);
      }
      
      private void setResultToRow(){
          rowsBuilderService.setHeaderRow();
          for (Instalment element : resultList){
           rowsBuilderService.constructRows(element);
          }
      }
      private void setRowToTable (List<Row> rows){
          for (Row cell : rows){
              table.addCell(cell.getCellId());
              table.addCell(cell.getCellPartCapital());
              table.addCell(cell.getCellPartInterest());
              table.addCell(cell.getCallPartConstant_Fee());
              table.addCell(cell.getCellFinalInterest());
              table.startNewRow();
          }
      }
      
     
    public List<Instalment> getResultList() {
        return resultList;
    }
    
    
    private void flushContent() throws IOException{
        FileWriter fwOb = new FileWriter( path , false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();

    }
    
    public void setResultList(List<Instalment> resultList) {
        this.resultList = resultList;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

  
    
  
    
}

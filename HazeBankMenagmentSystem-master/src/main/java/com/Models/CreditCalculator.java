/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Models;

import com.Models.Services.CalculatorService;
import com.Models.Services.PdfBuilderService;
import com.Models.Services.ConverterService;
import com.Models.Services.ValidateService;
import com.domain.CreditCalculatorApplication.Credit;
import com.domain.CreditCalculatorApplication.Instalment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;

/**
 *
 * @author Patryk
 */
public class CreditCalculator {
    
    List<String> data = new ArrayList<String>();
    List<Instalment> resultList = new ArrayList<Instalment>();
    ValidateService validateService = new ValidateService();
    ConverterService converterService = new ConverterService();
    CalculatorService calculatorService = new CalculatorService();
    PdfBuilderService pdfBuilderService = new PdfBuilderService();
    Credit credit = new Credit ();

    public boolean init (){
        
        validateService.setData(data);
    if (validateService.isEmpty() || !validateService.isNumber() || validateService.isZero()){
        return false;
    }
    converterService.setData(data);
    converterService.convert();
    credit = converterService.getCreder();
    calculatorService.setCredit(credit);
    resultList = calculatorService.calculateInstalments();
        
     return true;
    }
    
    public void runPdfBuilder () throws IOException{
        pdfBuilderService.setResultList(resultList);
        pdfBuilderService.constructPdfFile();
        
    }
    public void setLinkToFilePDF (String path){
        pdfBuilderService.setPath(path);
    }
    
   
      public List<String> getData() {
        return data;
    }

    public List<Instalment> getResultList() {
        return resultList;
    }

    public void setResultList(List<Instalment> resultList) {
        this.resultList = resultList;
    }
    
    public void setData(List<String> data) {
        this.data = data;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

   
    
}

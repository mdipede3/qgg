/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Models.Services;

import com.domain.CreditCalculatorApplication.Credit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patryk
 */
public class ConverterService {
   List<String> data = new ArrayList<String>();
   Credit credit = new Credit();
   
public void convert(){
    credit.setSummaryCredit(convertStringToDouble(data.get(0)));
    credit.setStockInstalmentCredit(convertStringToInt(data.get(1)));
    credit.setPercentCredit(convertStringToDouble(data.get(2)));
    credit.setCONSTANT_FEE(convertStringToDouble(data.get(3)));
    credit.setTypeOfCredit(data.get(4));
    credit.setHadPdf(data.get(5));
}

 private double convertStringToDouble(String value) {
     return Math.abs(Double.parseDouble(value.replace(",", ".")));
    }
   private int convertStringToInt(String value) {
       return Math.abs(Integer.parseInt(value));
    }
   
  private boolean convertStringToBoolean (String value){
      return Boolean.valueOf(value);
  }
   private boolean stringHaveChar (String testValue){
       if (testValue.contains(",")) return true; return false;
   }
 


    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public Credit getCreder() {
        return credit;
    }

    public void setCreder(Credit creder) {
        this.credit = creder;
    }

  

   

   
}

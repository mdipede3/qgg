/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Models.Services;

import com.domain.CreditCalculatorApplication.Credit;
import com.domain.CreditCalculatorApplication.Instalment;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patryk
 */
public class CalculatorService {
    
    Credit credit = new Credit ();
    List<Instalment> resultList = new ArrayList<Instalment>();
    double pay = 0;
    public List<Instalment> calculateInstalments (){
       for (int i = 0; i < credit.getStockInstalmentCredit(); i++){
            if (credit.getTypeOfCredit().equals("constant")){
                 resultList.add(calculateConstantInstalment(i));
            }
            else {
                resultList.add(calculateLessInstalment(i));
            }
        }
       return resultList;
    }
     private Instalment calculateConstantInstalment(int i ) {
        Instalment instalment = new Instalment();
        instalment.setId(i+1);
        instalment.setPartConstantFee(roundToDecimal(calculatePartConstantFee ()));
        double q = 1 + (credit.getPercentCredit()/12);
        /*double finalInstalment = (credit.getSummaryCredit()*Math.pow(q, credit.getStockInstalmentCredit()))
                -((q-1)/(Math.pow(q,credit.getStockInstalmentCredit()-1))) + instalment.getPartConstantFee();*/
        double finalPartCapital = credit.getSummaryCredit() / credit.getStockInstalmentCredit();
        double finalPartInterest = finalPartCapital * (credit.getPercentCredit() / 100);
        double finalInstalment = finalPartCapital + finalPartInterest + instalment.getPartConstantFee();
        instalment.setPartCapital(roundToDecimal(finalPartCapital));
        instalment.setPartInterest(roundToDecimal(finalPartInterest));
        instalment.setFinalInterest(roundToDecimal(finalInstalment));
        return instalment;
    }
       private double calculatePartConstantFee() {
        double constantFeeFinal = credit.getSummaryCredit()*(credit.getCONSTANT_FEE()/100);
        return constantFeeFinal/credit.getStockInstalmentCredit();
    }

    private Instalment calculateLessInstalment(int i) {
        Instalment instalment = new Instalment();
        instalment.setId(i);
        instalment.setPartConstantFee(roundToDecimal(calculatePartConstantFee ()));
        double calcPartCapital = credit.getSummaryCredit()/credit.getStockInstalmentCredit();
        pay = pay + calcPartCapital;
        double calcPartInterest = (credit.getSummaryCredit()-pay) *((credit.getPercentCredit()/100)/12);
        double finalInstalment = calcPartCapital + calcPartInterest + instalment.getPartConstantFee();
        instalment.setPartCapital(roundToDecimal(calcPartCapital));
        instalment.setPartInterest(roundToDecimal(calcPartInterest));
        instalment.setFinalInterest(roundToDecimal(finalInstalment));
        return instalment;
       
    }
    private Double roundToDecimal (Double value){
         return (double) Math.round(value * 100) / 100;

    }
  

    

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

  

   
   
    
}

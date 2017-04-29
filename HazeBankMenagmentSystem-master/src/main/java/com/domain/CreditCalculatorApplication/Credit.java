/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.CreditCalculatorApplication;

/**
 *
 * @author Patryk
 */
public class Credit {
    private double summaryCredit;
    private int stockInstalmentCredit;
    private double percentCredit;
    private double CONSTANT_FEE;
    private String typeOfCredit;
    private double nowCapital = summaryCredit;
    private String hadPdf;

    public String isHadPdf() {
        return hadPdf;
    }

    public void setHadPdf(String hadPdf) {
        this.hadPdf = hadPdf;
    }
    

    public double getNowCapital() {
        return nowCapital;
    }

    public void setNowCapital(double nowCapital) {
        this.nowCapital = nowCapital;
    }
    
    
    public double getSummaryCredit() {
        return summaryCredit;
    }

    public void setSummaryCredit(double summaryCredit) {
        this.summaryCredit = summaryCredit;
    }

    public int getStockInstalmentCredit() {
        return stockInstalmentCredit;
    }

    public void setStockInstalmentCredit(int stockInstalmentCredit) {
        this.stockInstalmentCredit = stockInstalmentCredit;
    }

    public double getPercentCredit() {
        return percentCredit;
    }

    public void setPercentCredit(double percentCredit) {
        this.percentCredit = percentCredit;
    }

    public double getCONSTANT_FEE() {
        return CONSTANT_FEE;
    }

    public void setCONSTANT_FEE(double CONSTANT_FEE) {
        this.CONSTANT_FEE = CONSTANT_FEE;
    }

    public String getTypeOfCredit() {
        return typeOfCredit;
    }

    public void setTypeOfCredit(String typeOfCredit) {
        this.typeOfCredit = typeOfCredit;
    }
    
}

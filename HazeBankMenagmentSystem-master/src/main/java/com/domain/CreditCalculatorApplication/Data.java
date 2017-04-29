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
public class Data {
    private String summaryCredit;
    private String stockInstalmentCredit;
    private String percentCredit;
    private String CONSTANT_FEE;
    private String typeOfCredit;  

    public String getSummaryCredit() {
        return summaryCredit;
    }

    public void setSummaryCredit(String summaryCredit) {
        this.summaryCredit = summaryCredit;
    }

    public String getStockInstalmentCredit() {
        return stockInstalmentCredit;
    }

    public void setStockInstalmentCredit(String stockInstalmentCredit) {
        this.stockInstalmentCredit = stockInstalmentCredit;
    }

    public String getPercentCredit() {
        return percentCredit;
    }

    public void setPercentCredit(String percentCredit) {
        this.percentCredit = percentCredit;
    }

    public String getCONSTANT_FEE() {
        return CONSTANT_FEE;
    }

    public void setCONSTANT_FEE(String CONSTANT_FEE) {
        this.CONSTANT_FEE = CONSTANT_FEE;
    }

    public String getTypeOfCredit() {
        return typeOfCredit;
    }

    public void setTypeOfCredit(String typeOfCredit) {
        this.typeOfCredit = typeOfCredit;
    }

    @Override
    public String toString() {
        return "Data{" + "summaryCredit=" + summaryCredit + ", stockInstalmentCredit=" + stockInstalmentCredit + ", percentCredit=" + percentCredit + ", CONSTANT_FEE=" + CONSTANT_FEE + ", typeOfCredit=" + typeOfCredit + '}';
    }
    
}

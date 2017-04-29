/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.CreditCalculatorApplication;

import com.itextpdf.layout.element.Cell;

/**
 *
 * @author Patryk
 */
public class Row {
    private Cell cellId = new Cell();
    private Cell cellPartCapital = new Cell();
    private Cell cellPartInterest = new Cell();
    private Cell callPartConstant_Fee = new Cell();
    private Cell cellFinalInterest = new Cell();

    public Cell getCellId() {
        return cellId;
    }

    public void setCellId(String value) {
        cellId.add(value);
    }

    public Cell getCellPartCapital() {
        return cellPartCapital;
    }

    public void setCellPartCapital(String value) {
        cellPartCapital.add(value);
    }

    public Cell getCellPartInterest() {
        return cellPartInterest;
    }

    public void setCellPartInterest(String value) {
        cellPartInterest.add(value);
    }

    public Cell getCallPartConstant_Fee() {
        return callPartConstant_Fee;
    }

    public void setCallPartConstant_Fee(String value) {
        callPartConstant_Fee.add(value);
    }

    public Cell getCellFinalInterest() {
        return cellFinalInterest;
    }

    public void setCellFinalInterest(String value) {
        cellFinalInterest.add(value);
    }
     

}

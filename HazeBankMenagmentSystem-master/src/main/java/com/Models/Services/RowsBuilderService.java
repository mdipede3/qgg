/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Models.Services;

import com.domain.CreditCalculatorApplication.Instalment;
import com.domain.CreditCalculatorApplication.Row;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patryk
 */
public class RowsBuilderService {
 private List<Row> rows = new ArrayList<Row>(); 

 public void setHeaderRow(){
    Row row = new Row();
    row.setCellId("ID");
    row.setCellPartCapital("Czesc kapitalowa");
    row.setCellPartInterest("Czesc odsetkowa");
    row.setCallPartConstant_Fee("Oplata stala");
    row.setCellFinalInterest("Rata calkowita");
    rows.add(row);
 }
 
public void constructRows (Instalment instalment){
    
    Row row = new Row();
    row.setCellId(String.valueOf(instalment.getId()));
    row.setCellPartCapital(String.valueOf(instalment.getPartCapital()));
    row.setCellPartInterest(String.valueOf(instalment.getPartInterest()));
    row.setCallPartConstant_Fee(String.valueOf(instalment.getPartConstantFee()));
    row.setCellFinalInterest(String.valueOf(instalment.getFinalInterest()));
    rows.add(row);
    
    
}

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

 
 
 
 
}

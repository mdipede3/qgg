/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Models.Services;

import com.domain.CreditCalculatorApplication.Data;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patryk
 */
public class ValidateService {
    List<String> data = new ArrayList<String>();
    
public boolean isEmpty (){
    for (String value : data){
        if (value.equals("") || value == null){
            return true;
        }
    }
    return false;
}
 
public boolean isNumber (){
    for (String value : data){
        if (value.matches("-?\\d+(\\.\\d+)?"))
            return true;
    }
    return false;
}

public boolean isZero (){
    for (String value : data){
        if (value.equals("0") || value == "0"){
            return true;
        }
    }
    return false;
}

    public void setData(List<String> data) {
        this.data = data;
    }
}

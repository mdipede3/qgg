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
public class Instalment {
    private double partCapital;
    private double partInterest;
    private double finalInterest;
    private int id;
    private double partConstantFee;

    @Override
    public String toString() {
        return "Instalment{" + "partCapital=" + partCapital + ", partInterest=" + partInterest + ", finalInterest=" + finalInterest + ", id=" + id + ", partConstantFee=" + partConstantFee + '}';
    }
    
    public double getPartConstantFee() {
        return partConstantFee;
    }

    public void setPartConstantFee(double partConstantFee) {
        this.partConstantFee = partConstantFee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getFinalInterest() {
        return finalInterest;
    }

    public void setFinalInterest(double finalInterest) {
        this.finalInterest = finalInterest;
    }

    public double getPartCapital() {
        return partCapital;
    }

    public void setPartCapital(double partCapital) {
        this.partCapital = partCapital;
    }

    public double getPartInterest() {
        return partInterest;
    }

    public void setPartInterest(double partInterest) {
        this.partInterest = partInterest;
    }
    
}

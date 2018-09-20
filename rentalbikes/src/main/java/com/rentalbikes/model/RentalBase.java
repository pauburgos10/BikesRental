/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentalbikes.model;

/**
 *
 * @author Paula
 */
public abstract class RentalBase {
    /** 
     * here are the common properties that all classes extending this base class will have
    */
    /**
     * for description purposes
     */
    public String name;
    
    /**
     * for identification purposes would be the ID on database
     */
    public int code;
    
    /**
     * fixed price per unit
    */    
    public double pricePerUnit;
    
    /**
     *  amount of hours/days/weeks requested  
     */
    public int unitsRequested;
      

    public int getUnitsRequested() {
        return unitsRequested;
    }

    public void setUnitsRequested(int unitsRequested) {
        this.unitsRequested = unitsRequested;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
     /**
      * this is an abstract method so all implementations must override and implement their own calculation
      * @return 
      */
    public abstract double calculateRent();
    
    
}

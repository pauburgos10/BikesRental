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
public class RentalByDay extends RentalBase{
    
    public RentalByDay(int unitsRequested) {
        this.name = "Rental By Day";
        this.code = 2;
        this.pricePerUnit = 20.0;
        this.unitsRequested = unitsRequested;
    }

    @Override
    public double calculateRent() {
        return unitsRequested * pricePerUnit;
    }

       
    
}

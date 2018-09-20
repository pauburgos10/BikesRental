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
public class RentalByWeek extends RentalBase{
    
    public RentalByWeek(int unitsRequested){
        this.name = "Rental By Week";
        this.code = 3;
        this.pricePerUnit = 60.0;
        this.unitsRequested = unitsRequested;
    }

    @Override
    public double calculateRent() {
        return unitsRequested * pricePerUnit;
    }

}

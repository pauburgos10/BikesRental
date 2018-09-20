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
public class RentalByHour extends RentalBase{

    public RentalByHour(int unitsRequested){
        this.name = "Rental By Hour";
        this.code = 1;
        this.pricePerUnit = 5.0;
        this.unitsRequested = unitsRequested;
    }

    @Override
    public double calculateRent() {
        return unitsRequested * pricePerUnit;
    }

}

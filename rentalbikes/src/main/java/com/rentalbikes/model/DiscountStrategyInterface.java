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
public interface DiscountStrategyInterface {
    
   public double CalculateDiscount(RentalBill rentalBilling);

}

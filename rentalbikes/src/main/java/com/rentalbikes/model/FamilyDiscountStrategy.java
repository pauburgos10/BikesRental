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
public class FamilyDiscountStrategy implements DiscountStrategyInterface{

    private static FamilyDiscountStrategy instance = new FamilyDiscountStrategy();
            
    public static final double FAMILY_DISCOUNT_RATE = 0.3;
    
    private FamilyDiscountStrategy(){}
    
    @Override
    public double CalculateDiscount(RentalBill rentalBilling) {
        if (rentalBilling.getBikeRentalList().size() >= 3 && rentalBilling.getBikeRentalList().size() <= 5)
	  {
              return rentalBilling.getTotalAmount() * (1-FAMILY_DISCOUNT_RATE);
	  }
        return rentalBilling.getTotalAmount();
    }
    
    public static FamilyDiscountStrategy getInstance(){
        if(instance == null) {
            instance = new FamilyDiscountStrategy();
        }
        return instance;
    }
    
}

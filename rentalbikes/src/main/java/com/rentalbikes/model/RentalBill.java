/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentalbikes.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paula
 */
public class RentalBill {
    
    private List<BikeRentalItem> bikeRentalList;

    private double totalAmount;
      
    /**
     * constructor to instantiate with a list of Rentals
     * @param bikeRentalList 
     */
    public RentalBill (List<BikeRentalItem> bikeRentalList){        
        this.bikeRentalList= bikeRentalList;        
    }
    
    /**
     * constructor to instantiate empty Billing and add Rentals later
     */
    public RentalBill(){
        bikeRentalList = new ArrayList<>();
    }
    
    public double calculateTotalBilling(){
        
        totalAmount = 0.0;
        List<BikeRentalItem> familyList = new ArrayList<>();
        for (BikeRentalItem bikeRental: bikeRentalList){           
            totalAmount += bikeRental.calculateRent();                      
        }        
              
        checkForDiscounts();        
        
        return totalAmount;
    }
    
    protected List<BikeRentalItem> getBikeRentalList() {
        return bikeRentalList;
    }

    protected void setBikeRentalList(List<BikeRentalItem> bikeRentalList) {
        this.bikeRentalList = bikeRentalList;
    }
    
    public void addBikeRentalItem(BikeRentalItem bikeRentalDetail){
        this.bikeRentalList.add(bikeRentalDetail);
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void checkForDiscounts() {
        for (DiscountStrategyInterface di: ActiveDiscounts.getInstance().getActiveDiscounts()){
            totalAmount = di.CalculateDiscount(this);
        }
    }
    
    /**
     * main method used for testing purposes
     * 
    public static void main (String args [] ){
        RentalBill rb = new RentalBill();
        
        BikeRentalItem bikeRentItem1 = new BikeRentalItem(new Bike(), new RentalByDay(2));
        rb.addBikeRentalItem(bikeRentItem1);
        BikeRentalItem bikeRentItem2 = new BikeRentalItem(new Bike(), new RentalByHour(8));
        rb.addBikeRentalItem(bikeRentItem2);
        BikeRentalItem bikeRentItem3 = new BikeRentalItem(new Bike(), new RentalByWeek(1));
        rb.addBikeRentalItem(bikeRentItem3);
        
        double total = rb.calculateTotalBilling();
        System.out.println("Total Billing: " + total);
    }
*/
    
}

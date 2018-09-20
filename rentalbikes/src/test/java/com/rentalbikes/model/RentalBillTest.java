/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentalbikes.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 *
 * @author Paula
 */
public class RentalBillTest {
  
    ActiveDiscounts ad = ActiveDiscounts.getInstance();
    
       
    public RentalBillTest() {
    }
    
    @Before
    public void setUp() {
        ad.addActiveDiscounts(FamilyDiscountStrategy.getInstance());
    }
  
    /**
     * Test of calculateTotalBilling method, of class RentalBill.
     */
    @Test
    public void testCalculateTotalBillingWithFamilyDiscount() {
        System.out.println("calculateTotalBilling");
        RentalBill rb = new RentalBill();
        
        BikeRentalItem bikeRentItem1 = new BikeRentalItem(mock(Bike.class), new RentalByDay(2));
        rb.addBikeRentalItem(bikeRentItem1);
        BikeRentalItem bikeRentItem2 = new BikeRentalItem(mock(Bike.class), new RentalByHour(8));
        rb.addBikeRentalItem(bikeRentItem2);
        BikeRentalItem bikeRentItem3 = new BikeRentalItem(mock(Bike.class), new RentalByWeek(1));
        rb.addBikeRentalItem(bikeRentItem3);
        
        double expResult = 98.0;
        double result = rb.calculateTotalBilling();
        assertEquals(expResult, result,0.0);
        
    }
    
    /**
     * Test of calculateTotalBilling method, of class RentalBill.
     */
    @Test
    public void testCalculateTotalBillingWithoutDiscount() {
        System.out.println("calculateTotalBilling");
        RentalBill rb = new RentalBill();
        
        BikeRentalItem bikeRentItem1 = new BikeRentalItem(mock(Bike.class), new RentalByDay(2));
        rb.addBikeRentalItem(bikeRentItem1);
        BikeRentalItem bikeRentItem3 = new BikeRentalItem(mock(Bike.class), new RentalByWeek(1));
        rb.addBikeRentalItem(bikeRentItem3);
        
        double expResult = 100.0;
        double result = rb.calculateTotalBilling();
        assertEquals(expResult, result,0.0);
        
    }

    
    /**
     * Test of setBikeRentalList getBikeRentalList and  method, of class RentalBill.
     */
    @Test
    public void testSetBikeRentalList() {
        System.out.println("setBikeRentalList");
        List<BikeRentalItem> bikeRentalList = new ArrayList<>();
        bikeRentalList.add(mock(BikeRentalItem.class));
        RentalBill rb = new RentalBill();
        rb.setBikeRentalList(bikeRentalList);
        assertTrue("bikeRentalList is not set",rb.getBikeRentalList().size() == 1);
    }

    /**
     * Test of addBikeRentalItem method, of class RentalBill.
     */
    @Test
    public void testAddBikeRentalItem() {
        System.out.println("addBikeRentalItem");
        BikeRentalItem bikeRentalDetail = mock(BikeRentalItem.class);
        RentalBill rb = new RentalBill();
        rb.addBikeRentalItem(bikeRentalDetail);
        assertTrue("bikeRentalList is not set",rb.getBikeRentalList().size() == 1);
    }

    /**
     * Test of getTotalAmount method, of class RentalBill.
     */
    @Test
    public void testGetTotalAmount() {
        System.out.println("getTotalAmount");
        RentalBill instance = new RentalBill();
        double expResult = 0.0;
        double result = instance.getTotalAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTotalAmount method, of class RentalBill.
     */
    @Test
    public void testSetTotalAmount() {
        System.out.println("setTotalAmount");
        double totalAmount = 40.0;
        RentalBill rb = new RentalBill();
        rb.setTotalAmount(totalAmount);
        assertTrue("Total Amount is not set", rb.getTotalAmount() == 40);
    }
    
}

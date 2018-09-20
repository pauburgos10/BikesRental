/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentalbikes.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Paula
 */
public class FamilyDiscountStrategyTest {
    
    public FamilyDiscountStrategyTest() {
    }

    @Before
    public void resetSingleton()  throws SecurityException,
            NoSuchFieldException, IllegalArgumentException,
            IllegalAccessException {
        Field instance = FamilyDiscountStrategy.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }
    

    /**
     * Test of CalculateDiscount method, of class FamilyDiscountStrategy.
     */
    @Test
    public void testCalculateDiscount() {
        System.out.println("CalculateDiscount");
        RentalBill rentalBilling = mock(RentalBill.class);
        List<BikeRentalItem> brList = new ArrayList<>();
        BikeRentalItem bikeRentItem1 = new BikeRentalItem(mock(Bike.class), mock(RentalByDay.class));
        brList.add(bikeRentItem1);
        BikeRentalItem bikeRentItem2 = new BikeRentalItem(mock(Bike.class), mock(RentalByDay.class));
        brList.add(bikeRentItem2);
        BikeRentalItem bikeRentItem3 = new BikeRentalItem(mock(Bike.class), mock(RentalByDay.class));
        brList.add(bikeRentItem3);
        
        when(rentalBilling.getBikeRentalList()).thenReturn(brList);
        when(rentalBilling.getTotalAmount()).thenReturn(100.0);
        
        FamilyDiscountStrategy instance = FamilyDiscountStrategy.getInstance();
        double expResult = 70.0;
        double result = instance.CalculateDiscount(rentalBilling);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getInstance method, of class FamilyDiscountStrategy.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        FamilyDiscountStrategy result = FamilyDiscountStrategy.getInstance();
        assertNotNull(result);
    }
    
}

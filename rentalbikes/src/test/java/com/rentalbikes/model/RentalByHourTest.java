/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentalbikes.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paula
 */
public class RentalByHourTest {
    
    public RentalByHourTest() {
    }

    /**
     * Test of calculateRent method, of class RentalByHour.
     */
    @Test
    public void testCalculateRent() {
        System.out.println("calculateRent");
        RentalByHour instance = new RentalByHour(2);
        double expResult = 10.0;
        double result = instance.calculateRent();
        assertEquals(expResult, result, 0.0);
    }
    
}

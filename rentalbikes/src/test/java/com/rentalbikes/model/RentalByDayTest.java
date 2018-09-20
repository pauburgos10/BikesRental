/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentalbikes.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paula
 */
public class RentalByDayTest {
    
    public RentalByDayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateRent method, of class RentalByDay.
     */
    @Test
    public void testCalculateRent() {
        System.out.println("calculateRent");
        RentalByDay instance = new RentalByDay(2);
        double expResult = 40.0;
        double result = instance.calculateRent();
        assertEquals(expResult, result, 0.0);
    }
    
}

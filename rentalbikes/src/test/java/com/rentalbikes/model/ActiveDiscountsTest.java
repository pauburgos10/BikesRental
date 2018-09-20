/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentalbikes.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paula
 */
public class ActiveDiscountsTest {
    
    public ActiveDiscountsTest() {
    }
    
    
    @Before
    public void resetSingleton()  throws SecurityException,
            NoSuchFieldException, IllegalArgumentException,
            IllegalAccessException {
        Field instance = ActiveDiscounts.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }
    

    /**
     * Test of getActiveDiscounts and getInstance method, of class ActiveDiscounts.
     */
    @Test
    public void testGetActiveDiscounts() {
        System.out.println("getActiveDiscounts");
        ActiveDiscounts instance = ActiveDiscounts.getInstance();
        List<DiscountStrategyInterface> expResult = new ArrayList<>();
        List<DiscountStrategyInterface> result = instance.getActiveDiscounts();
        assertEquals(expResult, result);
    }

   
    /**
     * Test of addActiveDiscounts method, of class ActiveDiscounts.
     */
    @Test
    public void testAddActiveDiscounts() {
        System.out.println("addActiveDiscounts");
        DiscountStrategyInterface activeDiscount = FamilyDiscountStrategy.getInstance();
        ActiveDiscounts ad = ActiveDiscounts.getInstance();
        ad.addActiveDiscounts(activeDiscount);
        assertTrue("activeDiscountsList is not set", ad.getActiveDiscounts().size() == 1);
    }
    
}

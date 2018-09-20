/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentalbikes.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is meant to hold the list of all Active Discounts. 
 * Is a Singleton because there should be only one instance holding the list of Active Discounts
 * Active Discounts should be added by addActiveDiscounts method
 * @author Paula
 */

public class ActiveDiscounts {
    private static ActiveDiscounts instance = new ActiveDiscounts();
    
    List<DiscountStrategyInterface> activeDiscounts;
    
    private ActiveDiscounts() {
        activeDiscounts = new ArrayList<>();
        
        //activeDiscounts.add(new FamilyDiscountStrategy()); 
    }

    public List<DiscountStrategyInterface> getActiveDiscounts() {
        return activeDiscounts;
    }
    
    public static ActiveDiscounts getInstance(){
        if(instance == null) {
            instance = new ActiveDiscounts();
        }
        return instance;
    }

    public void addActiveDiscounts(DiscountStrategyInterface activeDiscount) {
        this.activeDiscounts.add(activeDiscount);
    }
    
}

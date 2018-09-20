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

public class Bike {
    
    /**
     * id for identification purposes
     */
    private Long id;
    /**
     * not required but may be useful for offering purposes
     */
    private String model;
    /**
     * not required but may be useful for offering purposes
     */
    private String color;
    
    /**
     * RENTED
     * AVAILABLE
     * this would be useful for reporting purposes and also when building the BikeRentalItem it would be necessary 
     * to include only a bike that is AVAILABLE
     * when implemented could be taken from an Enum class or from the Database
     * depending on the need to add more statuses
    */
    private String status; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
       
}

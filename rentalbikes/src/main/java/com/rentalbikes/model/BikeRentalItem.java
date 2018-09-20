/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentalbikes.model;

import java.time.LocalDateTime;

/**
 * This class is meant to hold the information about the rental of each bike
 * it is the billing item to be summarized later in billing and holds the relation with the client that rented it
 * and the corresponding RentalBill
 * @author Paula
 */

public class BikeRentalItem {
         
    
    private Long id;
    
    private Client client;
    
    /**
     * date and time of rental start
     */
    private LocalDateTime dateTimeFrom;
    
    /**
     * date and time for rental due end
     */
    private LocalDateTime dueDateTime;
    
    /**
     * date and time of effective devolution
     */
    private LocalDateTime dateTimeReturned;
    
    /**
     * bike rented
     */
    private Bike bike;
    
    /**
     * Rental type: BY HOUR / BY DAY / BY WEEK
     */
    private RentalBase rentalType;
    
    /**
     * OVERDUE
     * ON TIME
     * ENDED
     * would be a good idea to have logic implemented to update this indicator for monitoring purposes
     * and also maybe send alerts when is overdue
     */
    private String status; 
     
    /**
     * this is to link to the Bill associated and may be useful in database 
     */
    private int rentalBillingId;
    
    
    public BikeRentalItem(Bike bike, RentalBase rentalType){
        this.bike = bike;
        this.rentalType = rentalType;
    }
    

    public LocalDateTime getDateTimeFrom() {
        return dateTimeFrom;
    }

    public void setDateTimeFrom(LocalDateTime dateTimeFrom) {
        this.dateTimeFrom = dateTimeFrom;
    }

    public LocalDateTime getDueTimeDate() {
        return dueDateTime;
    }

    public void setDueTimeDate(LocalDateTime dueTimeDate) {
        this.dueDateTime = dueTimeDate;
    }

    public LocalDateTime getDateTimeReturned() {
        return dateTimeReturned;
    }

    public void setDateTimeReturned(LocalDateTime dateTimeReturned) {
        this.dateTimeReturned = dateTimeReturned;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public int getRentalBillingId() {
        return rentalBillingId;
    }

    public void setRentalBillingId(int rentalBillingId) {
        this.rentalBillingId = rentalBillingId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getDateFrom() {
        return dateTimeFrom;
    }

    public void setDateFrom(LocalDateTime dateFrom) {
        this.dateTimeFrom = dateFrom;
    }

    public LocalDateTime getDueDate() {
        return dueDateTime;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDateTime = dueDate;
    }

    public LocalDateTime getDateReturned() {
        return dateTimeReturned;
    }

    public void setDateReturned(LocalDateTime dateReturned) {
        this.dateTimeReturned = dateReturned;
    }


    public RentalBase getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalBase rentalType) {
        this.rentalType = rentalType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public double calculateRent(){
        return rentalType.calculateRent();
    }

}

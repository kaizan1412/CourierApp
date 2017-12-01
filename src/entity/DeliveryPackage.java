/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author user
 */
public class DeliveryPackage {
    
    private String packageCode;
    private String destination;
    private String packageType;
    private Double packageWeight;
    private Date sentDate;
    private Dimention dimention;
    private String deliveryService;
    private Boolean insurance;
    private Double packagePrice;

    /**
     * @return the packageCode
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * @param packageCode the packageCode to set
     */
    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the packageType
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * @param packageType the packageType to set
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * @return the packageWeight
     */
    public Double getPackageWeight() {
        return packageWeight;
    }

    /**
     * @param packageWeight the packageWeight to set
     */
    public void setPackageWeight(Double packageWeight) {
        this.packageWeight = packageWeight;
    }

    /**
     * @return the sentDate
     */
    public Date getSentDate() {
        return sentDate;
    }

    /**
     * @param sentDate the sentDate to set
     */
    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    /**
     * @return the dimention
     */
    public Dimention getDimention() {
        return dimention;
    }

    /**
     * @param dimention the dimention to set
     */
    public void setDimention(Dimention dimention) {
        this.dimention = dimention;
    }

    /**
     * @return the deliveryService
     */
    public String getDeliveryService() {
        return deliveryService;
    }

    /**
     * @param deliveryService the deliveryService to set
     */
    public void setDeliveryService(String deliveryService) {
        this.deliveryService = deliveryService;
    }

    /**
     * @return the insurance
     */
    public Boolean getInsurance() {
        return insurance;
    }

    /**
     * @param insurance the insurance to set
     */
    public void setInsurance(Boolean insurance) {
        this.insurance = insurance;
    }

    /**
     * @return the packagePrice
     */
    public Double getPackagePrice() {
        return packagePrice;
    }

    /**
     * @param packagePrice the packagePrice to set
     */
    public void setPackagePrice(Double packagePrice) {
        this.packagePrice = packagePrice;
    }
    
    
}

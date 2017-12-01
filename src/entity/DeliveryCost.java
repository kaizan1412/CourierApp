/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class DeliveryCost {
    
    private String destination;
    private Double regular;
    private Double economy;
    private Double sameDeliveryService;
    private Double overnightService;
    private Double holidayDeliveryService;

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
     * @return the regular
     */
    public Double getRegular() {
        return regular;
    }

    /**
     * @param regular the regular to set
     */
    public void setRegular(Double regular) {
        this.regular = regular;
    }

    /**
     * @return the economy
     */
    public Double getEconomy() {
        return economy;
    }

    /**
     * @param economy the economy to set
     */
    public void setEconomy(Double economy) {
        this.economy = economy;
    }

    /**
     * @return the simpleDeliveryService
     */
    public Double getSameDeliveryService() {
        return sameDeliveryService;
    }

    /**
     * @param simpleDeliveryService the simpleDeliveryService to set
     */
    public void setSameDeliveryService(Double sameDeliveryService) {
        this.sameDeliveryService = sameDeliveryService;
    }

    /**
     * @return the overnightService
     */
    public Double getOvernightService() {
        return overnightService;
    }

    /**
     * @param overnightService the overnightService to set
     */
    public void setOvernightService(Double overnightService) {
        this.overnightService = overnightService;
    }

    /**
     * @return the holidayDeliveryService
     */
    public Double getHolidayDeliveryService() {
        return holidayDeliveryService;
    }

    /**
     * @param holidayDeliveryService the holidayDeliveryService to set
     */
    public void setHolidayDeliveryService(Double holidayDeliveryService) {
        this.holidayDeliveryService = holidayDeliveryService;
    }
    
    
    
}

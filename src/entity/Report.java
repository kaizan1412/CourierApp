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
public class Report {
    
    private Sender sender;
    private Receiver receiver;
    private DeliveryPackage packages;
    private String payment;
    private String amountPaymentOrCreditDebitNumber;
    private Double cost;

    /**
     * @return the sender
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    /**
     * @return the receiver
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * @param receiver the receiver to set
     */
    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * @return the packages
     */
    public DeliveryPackage getPackages() {
        return packages;
    }

    /**
     * @param packages the packages to set
     */
    public void setPackages(DeliveryPackage packages) {
        this.packages = packages;
    }

    /**
     * @return the payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * @return the cost
     */
    public Double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * @return the amountPaymentOrCreditDebitNumber
     */
    public String getAmountPaymentOrCreditDebitNumber() {
        return amountPaymentOrCreditDebitNumber;
    }

    /**
     * @param amountPaymentOrCreditDebitNumber the amountPaymentOrCreditDebitNumber to set
     */
    public void setAmountPaymentOrCreditDebitNumber(String amountPaymentOrCreditDebitNumber) {
        this.amountPaymentOrCreditDebitNumber = amountPaymentOrCreditDebitNumber;
    }
    
    
}

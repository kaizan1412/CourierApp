/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.CostDAO;
import dao.DeliveryCostLib;
import entity.DeliveryCost;
import entity.DeliveryPackage;
import entity.Dimention;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class TesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimention dimensi = new Dimention();
        dimensi.setHeight(0.3);
        dimensi.setLength(1.0);
        dimensi.setWidth(1.0);
        
        DeliveryPackage package2 = new DeliveryPackage();
        package2.setDeliveryService("sds");
        package2.setDestination("semarang");
        package2.setDimention(dimensi);
        package2.setInsurance(false);
        package2.setPackageCode("1001");
        package2.setPackagePrice(1000000.0);
        package2.setPackageType("document");
        package2.setPackageWeight(2.0);
 //       package2.setPayment("cash");
        package2.setSentDate(new Date());
        
        CostDAO costs = new CostDAO();
        double cost = costs.calculateCost(package2);
        
        System.out.println("Biaya pengiriman ke: " + package2.getDestination() + " sebesar: " + cost);
    }
    
    /*
     * 
     */
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.DeliveryCostLib;
import dao.ResiNoGenerator;
import entity.DeliveryCost;
import java.util.List;

/**
 *
 * @author user
 */
public class tescode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("No Resi: "+ ResiNoGenerator.generateResiNumber());
        List<DeliveryCost> cost = DeliveryCostLib.costLib();
        
        for (DeliveryCost deliveryCost : cost) {
            System.out.println("Kota: " + deliveryCost.getDestination());
        }
    }
    
}

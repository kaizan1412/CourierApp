/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.DeliveryCost;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public final class DeliveryCostLib {
    
    public static List<DeliveryCost> costLib(){
        List<DeliveryCost> libs = new ArrayList<>();
        
        try {
//            Scanner scan = new Scanner(new File("C:/Java_Latihan/FileTarif.txt"));
            Scanner scan = new Scanner(new File(DeliveryCostLib.class.getResource("/asset/FileTarif.txt").getFile()));
            while (scan.hasNextLine()) {
                String next = scan.nextLine();
                String[]data = next.split(",");
                
                DeliveryCost cost = new DeliveryCost();
                cost.setDestination(data[0]);
                cost.setEconomy(Double.parseDouble(data[1]));
                cost.setRegular(Double.parseDouble(data[2]));
                cost.setHolidayDeliveryService(Double.parseDouble(data[3]));
                cost.setOvernightService(Double.parseDouble(data[4]));
                cost.setSameDeliveryService(Double.parseDouble(data[5]));
                
                libs.add(cost);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeliveryCostLib.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return libs;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.DeliveryCost;
import entity.DeliveryPackage;
import java.util.List;

/**
 *
 * @author user
 */
public class CostDAO {
    
    private Double insuranceCost = 0.03; 
    
    public Double calculateCost(DeliveryPackage devpackage){
        Double totalCost = 0.0;
        
        Double costdest;
        Double weight = devpackage.getPackageWeight();
        Double price = devpackage.getPackagePrice();
        
        List<DeliveryCost> libcost = DeliveryCostLib.costLib();
        
        for (DeliveryCost deliveryCost : libcost) {
            
            if(deliveryCost.getDestination().equalsIgnoreCase(devpackage.getDestination())){
                if(devpackage.getDeliveryService().equalsIgnoreCase("regular")){
                    costdest = deliveryCost.getRegular();
                    if(devpackage.getInsurance()){
                        totalCost = (costdest * weight) + (price * insuranceCost);
                        System.out.println("Total COST DAO: "+ totalCost);
                    }
                    else{
                        totalCost = costdest * weight;
                    }
                }
                
                if(devpackage.getDeliveryService().equalsIgnoreCase("economy")){
                    costdest = deliveryCost.getEconomy();
                    if(devpackage.getInsurance()){
                        totalCost = (costdest * weight) + (price * insuranceCost);
                    }
                    else{
                        totalCost = costdest * weight;
                    }
                }
                
                if(devpackage.getDeliveryService().equalsIgnoreCase("ons")){
                    costdest = deliveryCost.getOvernightService();
                    if(devpackage.getInsurance()){
                        totalCost = (costdest * weight) + (price * insuranceCost);
                    }
                    else{
                        totalCost = costdest * weight;
                    }
                }
                
                if(devpackage.getDeliveryService().equalsIgnoreCase("sds")){
                    costdest = deliveryCost.getSameDeliveryService();
                    if(devpackage.getInsurance()){
                        totalCost = (costdest * weight) + (price * insuranceCost);
                    }
                    else{
                        totalCost = costdest * weight;
                    }
                }
                
                if(devpackage.getDeliveryService().equalsIgnoreCase("hds")){
                    costdest = deliveryCost.getHolidayDeliveryService();
                    if(devpackage.getInsurance()){
                        totalCost = (costdest * weight) + (price * insuranceCost);
                    }
                    else{
                        totalCost = costdest * weight;
                    }
                }
            }

        }
        
        return totalCost;
    }

    
}

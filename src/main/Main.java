/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.logistic.clients.ShippingService;
import core.logistic.creators.AirCreator;
import core.logistic.creators.LandCreator;
import core.logistic.creators.RailCreator;
import core.logistic.creators.SeaCreator;
import core.logistic.creators.TransportCreator;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        TransportCreator land = new LandCreator();
        TransportCreator sea = new SeaCreator();
        TransportCreator air = new AirCreator();
        TransportCreator rail = new RailCreator();
        
        ShippingService service = new ShippingService(land);
        service.calculate();
        
        service.setCreator(rail);
        service.calculate();
        
        service.setCreator(air);
        service.calculate();
        
        service.setCreator(sea);
        service.calculate();
    }
    
}

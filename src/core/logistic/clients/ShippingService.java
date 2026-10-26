/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.logistic.clients;

import core.logistic.creators.TransportCreator;

/**
 *
 * @author edangulo
 */
public class ShippingService {
    
    private TransportCreator creator;

    public ShippingService(TransportCreator creator) {
        this.creator = creator;
    }

    public void setCreator(TransportCreator creator) {
        this.creator = creator;
    }
    
    public void calculate() {
        creator.executeCalculation();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.logistic.creators;

import core.logistic.products.AirTransport;
import core.logistic.products.Transport;

/**
 *
 * @author edangulo
 */
public class AirCreator extends TransportCreator {
    
    @Override
    public Transport createTransport() {
        return new AirTransport();
    }
    
}

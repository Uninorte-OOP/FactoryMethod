/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.logistic.creators;

import core.logistic.products.RailTransport;
import core.logistic.products.Transport;

/**
 *
 * @author edangulo
 */
public class RailCreator extends TransportCreator {

    @Override
    public Transport createTransport() {
        return new RailTransport();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.logistic.creators;

import core.logistic.products.Transport;

/**
 *
 * @author edangulo
 */
public abstract class TransportCreator {
    
    public abstract Transport createTransport();
    
    public void executeCalculation() {
        Transport transport = createTransport();
        transport.calculateCost();
        transport.calculateEstimatedTime();
    }
    
}

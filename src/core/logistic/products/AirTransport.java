/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.logistic.products;

/**
 *
 * @author edangulo
 */
public class AirTransport implements Transport {
    
    @Override
    public void calculateCost() {
        System.out.println("Cost calculation for air");
    }

    @Override
    public void calculateEstimatedTime() {
        System.out.println("Estimated time calculation for air");
    }
    
}

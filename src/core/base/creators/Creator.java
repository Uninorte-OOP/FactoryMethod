/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.base.creators;

import core.base.products.Product;

/**
 *
 * @author edangulo
 */
public abstract class Creator {
    
    public abstract Product factoryMethod();
    
    public void someOperation() {
        Product product = factoryMethod();
        product.operation();
    }
    
}

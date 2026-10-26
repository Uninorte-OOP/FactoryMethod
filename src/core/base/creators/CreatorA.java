/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.base.creators;

import core.base.products.Product;
import core.base.products.ProductA;

/**
 *
 * @author edangulo
 */
public class CreatorA extends Creator {

    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
    
}

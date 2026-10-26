/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.base.clients;

import core.base.creators.Creator;

/**
 *
 * @author edangulo
 */
public class Client {
    
    private Creator creator;

    public Client(Creator creator) {
        this.creator = creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }
    
    public void executeOperation() {
        creator.someOperation();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.Serializable;

/**
 *
 * @author madan
 */
public class PayScale implements Serializable {
    static private int idCounter = 0;
    private int id ;
    
    public PayScale(){
    this.id = idCounter;
    idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        PayScale.idCounter = idCounter;
    }
    
    

}

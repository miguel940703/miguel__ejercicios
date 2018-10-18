/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia;

/**
 *
 * @author Perera
 */
public class cubo extends cuadrado {
    
    public cubo (double valor1){
        super(valor1);
    }
    
    public double getArea(){
        return Math.pow(this.valor1, 3);
    }
    
}
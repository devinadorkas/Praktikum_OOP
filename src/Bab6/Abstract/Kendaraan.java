/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6.Abstract;

/**
 *
 * @author LA
 */
public abstract class Kendaraan {
    //atribut
    String warna, merk; 
    int jmlRoda;
    
    //method
    abstract String tempatKendaraan();
    
    //konstruktor
    public Kendaraan() {
        this.jmlRoda = 4;
    }
    
}

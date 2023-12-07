/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4.Enkapsulasi;

/**
 *
 * @author LA
 */
public class HitungLimas {
    private int LuasAlas;
    public int Tinggi;
    double volume;

    public int getLuasAlas() {
        return LuasAlas;
    }
    public void setLuasAlas(int LuasAlas) {
        this.LuasAlas = LuasAlas;
    }
    
    //method
    double volumeLimas(){
        volume = (0.333 * getLuasAlas() * Tinggi);
        return volume;
    }
}

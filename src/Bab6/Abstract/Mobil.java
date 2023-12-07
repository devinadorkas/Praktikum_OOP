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
public class Mobil extends Kendaraan {
    //atribut
    int jmlRoda;
    
    @Override
    String tempatKendaraan(){
        return " adalah kendaraan darat";
    }

    public Mobil() {
        this.warna = "putih";
        this.merk = "Toyota";
    }
    
}

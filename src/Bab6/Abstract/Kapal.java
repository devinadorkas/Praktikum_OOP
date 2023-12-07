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
public class Kapal extends Kendaraan {

    public Kapal() {
        this.merk = "Garuda";
        this.warna = "Merah Putih";
    }
    
    @Override
    String tempatKendaraan(){
        return " adalah kendaraan air";
}
}

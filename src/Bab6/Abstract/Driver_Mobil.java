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
public class Driver_Mobil {
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        System.out.println("Mobil" + mbl.tempatKendaraan());
        System.out.println("Merk mobil : " + mbl.merk);
        System.out.println("Warna mobil : " + mbl.warna);
        System.out.println("Jumlah roda mobil : " + mbl.jmlRoda);
    } 
}

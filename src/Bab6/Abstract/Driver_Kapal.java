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
public class Driver_Kapal {
    public static void main(String[] args) {
        Kapal kpl = new Kapal();
        System.out.println("Kapal" + kpl.tempatKendaraan());
        System.out.println("Merk kapal : " + kpl.merk);
        System.out.println("Warna kapal : " + kpl.warna);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab7.Polimorfisme;

/**
 *
 * @author LA
 */
public class Driveclass {
    public static void main(String[] args) {
        //Membuat objek manusia
        Manusia manusia = new Manusia();
        
        //Membuat objek Apel dan Pisang
        Buah apel = new Apel();
        Buah pisang = new Pisang();
        //Memanggil metode makanBUah() pada Manusia untuk objek Apel dan pisang
        manusia.makanBuah(apel);
        manusia.makanBuah(pisang);
    }
}

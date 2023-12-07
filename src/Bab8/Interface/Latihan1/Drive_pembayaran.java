/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8.Interface.Latihan1;

import Bab8.Interface.Latihan2.*;
import ProjectPraktikum.Bab1.Bab5.Bab6.Bab7.Bab8.*;
import Bab8.Interface.*;
import Bab7.Polimorfisme.*;

/**
 *
 * @author LA
 */
public class Drive_pembayaran {
    public static void main(String[] args) {
        //Upcasting : Objek dari kelas turunan diubah menjadi objek dari kelas induk
        Pembayaran payment;
        payment = new P0001();
        //tampilan output dari Upcasting
        payment.tampilkanMember();
        
        //buat object tiap pembayaran
        Cash cash = new Cash();
        Kredit kredit = new Kredit();
        Emoney emoney = new Emoney();
        
        //Downcasting : Objek dari kelas induk diubah kembali menjadi objek dari kelas turunan
        //Cek apakah P0001 merupakan turunan dari payment
        if(payment instanceof P0001){
            P0001 p0001 = (P0001) payment; //Downcasting dengan menggunakan (P0001)
            
            //Mengakses metode yang hanya ada di kelas P0001
            System.out.println("Jenis Member: " + p0001.member(p0001));
            System.out.println("Total Pembelian: " + p0001.hitPembayaran(500000));
            System.out.println("Sisa Saldo: " + p0001.potSaldo());
        }
        //pembayran dengan cash
    }
}

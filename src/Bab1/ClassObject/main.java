/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab1.ClassObject;

/**
 *
 * @author LA
 */
public class main {
    public static void main(String[] args) {
        //membuat objek
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyota";
        System.out.println("Nama Kendaraan : " + mobil.nama);
        System.out.println("Warna Kendaraan : " + mobil.warna);
        System.out.println("Merk Kendaraan : " + mobil.merk);
        System.out.println("Jumlah Roda    : " + mobil.jmlRoda(4)+ "\n");
        System.out.println("Cara kendaraan bergerak : ");
        System.out.println("Saat maju : ");
        mobil.kendaraanMaju();
        System.out.println("Saat mundur : ");
        mobil.kendaraanMundur();
        System.out.println("Saat berhenti : " + mobil.nama);
        mobil.kendaraanBerhenti();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.Bab1;

/**
 *
 * @author LA
 */
public class Cetak_DataBarangKantor {
    public static void main(String[] args) {
        // membuat object dengan nama data_barang dari class Inventory_BarangKantor
        Inventory_BarangKantor data_barang = new Inventory_BarangKantor(); 
        //menggunakan method dari class Inventory_Barang Kantor dan menyertakan nama object 
        data_barang.setKode_barang("A001");
        data_barang.dataNamaBarang("Amplifier");
        data_barang.dataMerkBarang("Cort CM15R-BK");
        data_barang.dataKondisiBarang("Baik");
        data_barang.dataStokBarang(32);
        data_barang.dataHargaBarang(1100000);
        
        //mencetak data barang
        System.out.println("Data Barang Kantor");
        System.out.println("----------------------------");
        System.out.println("Nama Barang     : " + data_barang.cetakNamaBarang());
        System.out.println("Kode Barang     : " + data_barang.getKode_barang());
        System.out.println("Merk Barang     : " + data_barang.cetakMerkBarang());
        System.out.println("Harga Barang    : " + data_barang.cetakHargaBarang());
        System.out.println("Supplier        : " + data_barang.cetakSuppplierBarang());
        System.out.println("Stok            : " + data_barang.cetakStokBarang());
        System.out.println("Status          : " + data_barang.cetakStatusBarang());
        System.out.println("Kondisi         : " + data_barang.cetakKondisiBarang());
    }
}

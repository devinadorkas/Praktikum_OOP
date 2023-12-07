/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.Bab1.Bab3.Bab5;

import TugasPraktikum.Bab1.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LA
 */
public class Inventory_BarangKantor {
    private String kode_barang;
    String nama_barang, merk_barang, status_barang, kondisi_barang, supplier_barang;
    int harga_barang,stok_barang, jumlah;
    int tambahJumlah, jumlahDiperbaiki;
    
    //setter
    public void setKode_barang(String kode_barang){
        this.kode_barang = kode_barang;
    }
    void dataNamaBarang(String NamaBarang) {
        this.nama_barang = NamaBarang;
    }
    void dataMerkBarang(String MerkBarang){
        this.merk_barang = MerkBarang;
    }
    void dataStatusBarang(String StatusBarang){
        this.status_barang = StatusBarang;
    }
    void dataSupplierBarang(String SupplierBarang){
        this.supplier_barang = SupplierBarang;
    }
    void dataKondisiBarang(String KondisiBarang){
        this.kondisi_barang = KondisiBarang;
    }
    void dataHargaBarang(int HargaBarang){
        this.harga_barang = HargaBarang;
    }
    void dataStokBarang(int StokBarang){
        this.stok_barang = StokBarang;
    }
    void TambahJumlahBarang(int TambahJumlahBarang){
        this.tambahJumlah= tambahJumlah;
    }
    void TambahBarangDiperbaiki(int TambahBarangDiperbaiki){
        this.jumlahDiperbaiki = jumlahDiperbaiki;
    }
    //getter
    public String getKode_barang(){
        return kode_barang;
    }
    
    //method dari classInventory_BarangKantor
    String cetakNamaBarang() {
        return nama_barang;
    }
    String cetakMerkBarang(){
        return merk_barang;
    }
    String cetakStatusBarang(){
        return status_barang;
    }
    String cetakSuppplierBarang(){
        return supplier_barang;
    }
    String cetakKondisiBarang(){
        return kondisi_barang;
    }
    int cetakHargaBarang(){
        return harga_barang;
    }
    int cetakStokBarang(){
        return stok_barang;
    }
    int cetakTambahBarang(){
        return tambahJumlah;
    }
    int cetakJumlahDiperbaiki(){
        return jumlahDiperbaiki;
    }
    //konstruktor
    public Inventory_BarangKantor(){
        this.stok_barang = 24;
        this.supplier_barang = "CV. Bintang Mega";
    }
    // Overloading
    public int tambahBarang(int tambahJumlah) {
        return jumlah += tambahJumlah;
    }
    // Overloading method
    public int tambahBarang(int tambahJumlah, int jumlahDiperbaiki) {
        jumlah = tambahJumlah + jumlahDiperbaiki;
        return jumlah;
}
    }

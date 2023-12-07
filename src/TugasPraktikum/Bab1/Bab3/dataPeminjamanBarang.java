/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.Bab1.Bab3;

import TugasPraktikum.Bab1.Cetak_DataBarangKantor;
import TugasPraktikum.Bab1.Inventory_BarangKantor;

/**
 *
 * @author LA
 */
public class dataPeminjamanBarang extends Inventory_BarangKantor{
    String nama_peminjam, nama_barangpinjam, tanggal_peminjaman;
    int jumlah_dipinjam, biaya_peminjaman, tambahBarang;
    
//enkapsulasi
    private String id_peminjaman; 
    
    //setter
    void SetidPinjam(String idPinjam){
        this.id_peminjaman = idPinjam;
    }
    void tglPinjam(String tglPinjam){
        this.tanggal_peminjaman = tglPinjam;
    }
    void jmlPinjam(int jmlPinjam){
        this.jumlah_dipinjam = jmlPinjam;
    }
    void namaBarangPinjam(String namaBarangPinjam){
        this.nama_barangpinjam = namaBarangPinjam;
    }
    void namaPinjam(String namaPinjam){
        this.nama_peminjam = namaPinjam;
    }
    
    //getter
    String getidPinjam(){
        return id_peminjaman;
    }
    //method
    String tampil_namaPinjam(){
        return nama_peminjam;
    }
    String tampil_tglPinjam(){
        return tanggal_peminjaman;
    }
    String tampil_namaBarangPinjam(){
        return nama_barangpinjam;
    }
    int tampil_jmlPinjam(){
        return jumlah_dipinjam;
    }
    int tampil_biayaPinjam() {
        if (jumlah_dipinjam <= 10) {
            biaya_peminjaman = 250000;
        } else {
            biaya_peminjaman = 500000;
        }
        return biaya_peminjaman;
    }
}

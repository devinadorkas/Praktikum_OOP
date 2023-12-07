/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.Bab1.Bab3.Bab5.Bab6.Bab7.Bab8;

import TugasPraktikum.Bab1.Bab3.Bab5.Bab6.Bab7.*;
import TugasPraktikum.Bab1.Bab3.Bab5.Bab6.*;

/**
 *
 * @author LA
 */
public class PeminjamanAlatElektronik extends dataPeminjamanBarang implements lokasi_barang{
    String nama_peminjam, nama_barangpinjam;
    int durasiPeminjaman, biaya_pinjamperhari;
    
    //atribut inputan
    void namaPinjam(String namaPinjam){
        this.nama_peminjam = namaPinjam;
    }
    void namaBarangPinjam(String namaBarangPinjam){
        this.nama_barangpinjam = namaBarangPinjam;
    }
    void durasiPinjam(int durasiPinjam){
        this.durasiPeminjaman = durasiPinjam;
    }
    //method menampilkan output
    int tampil_durasiPinjam(){
        return durasiPeminjaman;
    }
    String tampil_namaPinjam(){
        return nama_peminjam;
    }
    String tampil_namaBarangPinjam(){
        return nama_barangpinjam;
    }

    public PeminjamanAlatElektronik() {
        this.biaya_pinjamperhari = 200000;
    }
    
    @Override
    int hitungBiayaPeminjaman(){
        int totalBiaya = durasiPeminjaman * biaya_pinjamperhari;
        return totalBiaya;
    }
    int tampil_biayaPinjam(){
        return hitungBiayaPeminjaman();
    }
//override dari interface lokasi_barang
    @Override
    public String tambahLokasi(){
        return lokasi_barang;
    }
}

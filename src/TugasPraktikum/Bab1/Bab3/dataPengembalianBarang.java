/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.Bab1.Bab3;

import TugasPraktikum.Bab1.Inventory_BarangKantor;

/**
 *
 * @author LA
 */
public class dataPengembalianBarang extends dataPeminjamanBarang{
    int jumlah_dikembalikan, belum_kembali, jumlah_pinjam;
    String tanggal_pengembalian; 
    //enkapsulasi
    private String id_pengembalian;
    
    //setter
    void SetidKembali(String idKmbl){
        this.id_pengembalian = idKmbl;
    }
    void jmlPinjam(int jmlPinjam){
        this.jumlah_pinjam = jmlPinjam;
    }
    void jmlKembali(int jmlKembali){
        this.jumlah_dikembalikan = jmlKembali;
    }
    void tglKembali(String tglKembali){
        this.tanggal_pengembalian = tglKembali;
    }

    //getter
    public String getId_pengembalian(){
        return id_pengembalian;
    }

    //method
    int tampil_jmlKembali() {
        return jumlah_dikembalikan;
    }
    String tampil_tglKembali(){
        return tanggal_pengembalian;
    }
    int tampil_blmKembali(){
        belum_kembali = jumlah_pinjam - jumlah_dikembalikan;
        return belum_kembali;
    }
    int tampil_biayaKembali(){
        return tampil_biayaPinjam();
    }
}

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
public class P0001 extends Pembayaran{
    public String name, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    public String InputPinKredit;
    
    public P0001(){
        this.name = "Afrida Dewi Marhiza";
        this.kode = "P0001";
        this.saldo = 300000;
        this.alamat = "Malang, Jl. Sigura-gura";
    }
    @Override
    double cekKode(String input){
        if(input.compareTo(kode)==0){
            diskon = 0.3;
    }
        else{
        diskon = 0;
    }
    return diskon;
    }
    @Override
    double hitPembayaran(double bayar){
        diskon = bayar *diskon;
        total = bayar-diskon;
        return total;
    }
    double potSaldo(){
        return this.saldo-total;
    }
    @Override
        void tampilkanMember(){
            System.out.println("Member P0001 dengan diskon 30%");
    }
        
    void jenisPembayaran(Cash cash) {
    if (bayar >= total) {
    System.out.println("Kembalian : " + 
   cash.kembalian(total, bayar));
    } else if (bayar <= total) {
    System.out.println("uang anda kurang");
    } else {
    System.out.println("Pembayaran Berhasil");
    }
 }
 
 void jenisPembayaran(Emoney emoney) {
    emoney.scanQris();
 }
 
 void jenisPembayaran(Kredit kredit) {
    kredit.cekKartuKredit(kode, InputPinKredit);
 }

}

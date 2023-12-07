/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4.Enkapsulasi;

/**
 *
 * @author LA
 */
public class mainGaji {
    public static void main(String[] args) {
        pembayaranGaji gaji = new pembayaranGaji();
        gaji.setInput("G12345");
        System.out.println("Rekening yang anda masukkan : "+ gaji.getInput());
        System.out.println("Jumlah saldo anda : "+ gaji.cekSaldo());
    }
}

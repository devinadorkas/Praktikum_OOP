/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8.Interface;

/**
 *
 * @author LA
 */
public class Main {
    public static void main(String[] args) {
        Payment pay1 = new Payment((750000)); //atur jumlah uang total pembelian disini
        
        pay1.titlePurchase(1);
        System.out.println("credit Balance : " + pay1.creditBalance);
        System.out.println("Emoney Balance : " + pay1.emoneyBalance);
        System.out.println("Cash Balance : " + pay1.cashBalance);
        System.out.println("========================================");
        System.out.println("Total Payment : " + pay1.total);
        System.out.println("========================================");
        //menampilkan sisa saldo dengan berbagai macam metode pembayaran
        System.out.println("payment with Credit, Ending Balance : " + pay1.creditProses());
        System.out.println("payment with E-Money, Ending Balance : " + pay1.emoneyProses());
        System.out.println("payment with Cash, Ending Balance : " + pay1.cashProses());
    }
}

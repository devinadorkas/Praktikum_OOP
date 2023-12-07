/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab9.Exception;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author LA
 */
public class Lat_Exception {
    public static void main(String[] args) {
        try{
            int a, b, hasil;
            //membuat scanner baru
            Scanner keyboard = new Scanner(System.in);
            System.out.println("=== Program Pembagian ===");
            System.out.println("Masukkan angka 1 = ");
            a = Integer.parseInt(keyboard.next());
            System.out.println("Masukkan angka 2 = ");
            b = Integer.parseInt(keyboard.next());
            hasil = a/b;
            System.out.println(Integer.toString(hasil));
        }catch(ArithmeticException c){
            JOptionPane.showMessageDialog(null, "Nilai pembagi tidak boleh 0!!", "Warning", 2);
        }catch(NumberFormatException c){
            JOptionPane.showMessageDialog(null, "Input yang Anda masukkan huruf bukan angka!!", "Warning", 2);
        }finally{
            System.out.println("Terimakasih sudah menjalankan program");
        }
    }
}

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
public class throwException {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jmlKaki;
        System.out.println("Berapa jumlah kaki kerbau?");
        try{
            System.out.println("Jumlah kaki : ");
            jmlKaki = input.nextInt(); //Mendapatkan input dari user
            if(jmlKaki !=4){
                //jika jumlah kaki kerbau lebih atau kurang dari 4, maka akan terjadi error
                throw new NullPointerException("Terjadi Kesalahan Nih!");
            }else{
                System.out.println("Benar jumlah kaki kerbau 4");
            }
        }catch(NullPointerException e){
            //menampilkan pesan kesalahan
            e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8.Interface.Latihan1;

import Bab8.Interface.Latihan2.*;
import ProjectPraktikum.Bab1.Bab5.Bab6.Bab7.Bab8.*;

/**
 *
 * @author LA
 */
public class Kredit {
    void cekKartuKredit(String norek, String input){
        if(norek.equals(input)){
            System.out.println("Pembayaran Kredit success");
        }else{
            System.out.println("Pembayaran Gagal, kata sandi salah");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab7.Polimorfisme;

/**
 *
 * @author LA
 */
public class Pisang extends Buah {
        public Pisang(){
            this.nama = "Pisang";
        }
        //implementasi makanBuah() untuk pisang
        void makaBuah(){
            System.out.println(nama + "dimakan dengan dikupas kulitnya");
        }
    }

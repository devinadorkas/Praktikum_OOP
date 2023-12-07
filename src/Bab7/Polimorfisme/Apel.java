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
public class Apel extends Buah {
    public Apel(){
        this.nama = "apel";
    }
    //implemetasi makanBuah() khusus untuk Apel
    void makanBuah(){
        System.out.println(nama + " dimakan dengan dikupas kulitnya atau diaman langsung");
    }
}

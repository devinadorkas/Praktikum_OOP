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
public abstract class Pembayaran {
    abstract double hitPembayaran(double bayar);
    abstract double cekKode(String input);
    abstract void tampilkanMember();
    
    String member(G0001 member){
        return "Gold";
    }
    String member(P0001 member){
        return "Platinum";
    }
    String member(S0001 member){
        return "Silver";
    }
}

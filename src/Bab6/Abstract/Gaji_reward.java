/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6.Abstract;

/**
 *
 * @author LA
 */
public class Gaji_reward extends Gaji_abs_reward {
    //atribut
    double menit, waktu;
    double total;
    double tunj_bonus, gajipokok, tunj_anak, anak;
    
    @Override
    double tunjanganAnak(){
        if (anak == 1){
            tunj_anak = gajipokok * 0.1;
        }
        else if (anak > 1){
            tunj_anak = gajipokok * 0.2;
        }
        return tunj_anak;
    }
    @Override
    double lembur(){
        waktu = (menit/60) * 25000;
        tunj_bonus = tunjanganAnak() + waktu;
        return tunj_bonus;
    }
    
}

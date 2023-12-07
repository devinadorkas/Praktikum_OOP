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
public class pembayaranGaji {
    private String nomorRekening;
    private String input;
    private double saldo;
    public pembayaranGaji(){
        this.nomorRekening = "G12345";
        this.saldo = 1000000;
    }
    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    public double cekSaldo(){
        if(getNomorRekening().equals(getInput())){
            return getSaldo();
        }
        else{
            return 0;
        }
    }
}

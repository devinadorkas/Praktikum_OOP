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
public class Payment extends Purchase implements Cash, Credit, EMoney{
    double total, creditBalance, emoneyBalance, cashBalance;
    public Payment(double setTotal){
        this.creditBalance = 1000000;
        this.emoneyBalance = 500000;
        this.cashBalance = 1500000;
        this.total = setTotal;
    }
    //dari induk abstract Purchase
    @Override
    void titlePurchase(int numberPurchase){
        System.out.println("Pembelian ke- " + numberPurchase);
    }
    //dari interface cash
    @Override
    public double cashProses(){
        total = cashBalance - this.total;
        return total;
    }
    //dari interface credit
    @Override
    public double creditProses(){
        total = creditBalance - this.total;
        return total;
    }
    //dari emoney
    @Override
    public double emoneyProses(){
        total = emoneyBalance - this.total;
        return total;
    }
}

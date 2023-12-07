/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab9.Exception;

/**
 *
 * @author LA
 */
public class throwsException {
    static void Error() throws ClassNotFoundException{
        System.out.println("Ada yang Error ni!");
        throw new ClassNotFoundException("Error sudah saya tangkap!");
    }
    public static void main(String[] args) {
        try{
            throwsException.Error();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

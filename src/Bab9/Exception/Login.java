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
public class Login {
    private String username, password;
    public String nama;
    public Login(){
        nama = "Devina Dorkas Manuela";
        username = "ella";
        password = "ella1470";
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    boolean CekLogin (String Username, String password){
        if(username.equals(getUsername()) && password.equals(getPassword())){
            return true;
        }
        return false;
    }
}

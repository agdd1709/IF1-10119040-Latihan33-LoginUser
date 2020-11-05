/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan33.userlogin;
import java.util.Scanner;
import if1.pkg10119040.latihan33.userlogin.login;

/**
 *
 * @author Acer
 */
public class IF110119040Latihan33UserLogin {

    private static String usName;
     private static String passWord;
    
    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
     
        
        System.out.print("Masukan Username = ");
        usName = input.next();
        
        System.out.print("Masukan Password = ");
        passWord = input.next();
        
        login usLog = new login();
        
        usLog.pengecekanLogin(usName, passWord);
    
    }
    
}

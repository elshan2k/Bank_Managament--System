/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Bank;

/**
 *
 * @author HP
 */
public class Test {
    static UserArray ar;
    public static void main(String[] args) {
        int n = (int) (Math.random()*1000+1000);
        System.out.println(n);
        ar=new UserArray();
        User u1=new Client("admin","admin","admin",1000,"admin");
        ar.addUser(u1);
        
        if(ar.logInCheck(1001, "admin")){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
    
}

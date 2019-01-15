/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Bank;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author HP
 */
public class User {
    protected String name;
    protected String surname;
    protected String email;
    protected int id;
    protected String password;
    protected double balance=0.0;
    protected String address;
    protected String dot;
    protected ArrayList<String> historyList = new ArrayList();
    protected boolean isBlocked = false;

    public User(String name, String surname, String email, int id, String password) {
        this.email=email;
        this.name = name;
        this.surname = surname;  
        this.id = id;
        setPassword(password);
    }
    public User(String name, String surname, String email, int id, String password,String address) {
        this.email=email;
        this.name = name;
        this.surname = surname;  
        this.id = id;
        this.address = address;
        setPassword(password);
    }
     public User(String name, String surname, String email, int id, String password,String address,String dot) {
        this.email=email;
        this.name = name;
        this.surname = surname;  
        this.id = id;
        this.address = address;
        this.dot = dot;
        setPassword(password);
    }
     
     public User(String name, String surname, String email, int id, String password,boolean isBlocked) {
        this.email=email;
        this.name = name;
        this.surname = surname;  
        this.id = id;
        setPassword(password);
        this.isBlocked=isBlocked;
    }
     
     

    public User() {
        
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        
        return password;
    }

    public void setPassword(String password) {
        
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname + ", email=" + email + ", id=" + id + ", password=" + password + ", balance=" + balance + ", address=" + address + '}';
    }
    
     public void addTransaction(double balance, double change, String tType, int id) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date =new Date();
        String currentDate = dateFormat.format(date);
        if (id == -1) {
            String hist= "$" + change +" "+tType + " your account, balance: $"+balance +". "+currentDate;
            historyList.add(hist);
        }else{
            String hist= "$"+change+" Transfered to "+id+", balance: $"+balance+". "+currentDate;
            historyList.add(hist);
        }
        
    }
     
     public void getTransaction(double balance, double change, String tType, int id){
          DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date =new Date();
        String currentDate = dateFormat.format(date);
        String hist= "$"+change+" to your account from "+id+", balance: $"+balance+". "+currentDate;
        historyList.add(hist);
     }
   

   
 
    public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }

    
    
    
}

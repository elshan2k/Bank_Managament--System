/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Bank;

import com.toedter.calendar.JDateChooser;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Client extends User{
    
    
    
    public Client(String name, String surname, String email, int id, String password,String address, Date dot) {
        super(name, surname, email, id, password, address, dot);
    }
    
    public Client(String name, String surname, String email, int id, String password,String address) {
        super(name, surname, email, id, password,address);
    }
    public Client(String name, String surname, String email, int id, String password) {
        super(name, surname, email, id, password);
    }

    public Client(String name, String surname, String email, int id, String password, boolean isBlocked) {
        super(name, surname, email, id, password, isBlocked);
    }
    
  
   
    
    
}

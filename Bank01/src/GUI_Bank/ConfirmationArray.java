/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
 
/**
 *
 * @author HP
 */
public class ConfirmationArray {
    public static ArrayList<User> userlist = new ArrayList<>();
    private int index;
   

    public ConfirmationArray() {

    }

    public void addUser(User u) {
        userlist.add(u);
    }

    public User getUser(int i) {
        return userlist.get(i);
    }

    public boolean logInCheck(int id, String password) {
        for (int i = 0; i < userlist.size(); i++) {
            if (userlist.get(i).id == id && userlist.get(i).getPassword().equals(password)) {
                return true;
            }

        }
        return false;

    }
    
    public boolean idCheck(int id) {
        for (int i = 0; i < userlist.size(); i++) {
            if (userlist.get(i).id == id) {
                return false;
            }

        }
        return true;

    }
    
    public void setIndex(int id){
         for (int i = 0; i < userlist.size(); i++) {
            if (userlist.get(i).id == id) {
               index = i; 
            }
        }
    }
      public int getIndexByID(int id){
         for (int i = 0; i < userlist.size(); i++) {
            if (userlist.get(i).id == id) {
               return i; 
            }
        }
         return -1;
    }
    

    public int getIndex() {
        return this.index;
    }
        
    

    public int getSize() {
        return this.userlist.size();
    }

    public void removeUser(int i) {
        userlist.remove(i);
    }
    @Override
    public String toString() {
        return "UserArray{" + "userlist=" + userlist + '}';
    }
    


}

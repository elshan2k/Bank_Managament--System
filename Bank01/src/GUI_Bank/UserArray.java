/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Bank;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class UserArray {

    ArrayList<User> userlist = new ArrayList<>();

    public UserArray() {

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

    public int getSize() {
        return this.userlist.size();
    }

    @Override
    public String toString() {
        return "UserArray{" + "userlist=" + userlist + '}';
    }

}
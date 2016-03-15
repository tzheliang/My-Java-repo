/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tan Zheliang
 */
public class PhoneCard {
    // attributes
    private String phoneNumber;
    private double balance;
    
    // constructor
    public PhoneCard() {
        phoneNumber = "";
        balance = 0.0;
    }
    
    public PhoneCard(String inNumber, double inBalance) {
        phoneNumber = inNumber;
        
        if (inBalance > 0 ) { 
            balance = inBalance;
        }
    }
    
    // get
    public double getBalance() {
        return balance;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setBalance(double newBalance) {
        if (newBalance >= 0 ) {
            balance = newBalance;
        }
    }
    
    public void setPhoneNumber(String newNumber) {
        phoneNumber = newNumber;
    }
    
    public boolean makeCall(int minutes, double cost) {
        if (balance > 0) {
            balance -= (minutes * cost);
        }
        else {
            return false;
        }
        if (balance < 0) {
            balance = 0;
            return false;
        }
        return true;
    }
    
    public void topUp (double newBalance) {
        if (newBalance > 0) {
            balance += newBalance;
        }
    }
}
    


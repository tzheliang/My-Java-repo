/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tan Zheliang
 */

import java.util.*;

public class Telephonr {
    public static void main (String[] args) {
        PhoneCard pc = new PhoneCard("012-2313413", 5.0);
        
        boolean status = pc.makeCall(20, 0.3);
        if (status == true) {
            System.out.println("Call successful ");
        }
        else {
            System.out.println("Call failed.");
        }
        
        System.out.println("You have balance of " + pc.getBalance());
        
        pc.topUp(15);
        
        System.out.println("New balance " + pc.getBalance());
    }
}
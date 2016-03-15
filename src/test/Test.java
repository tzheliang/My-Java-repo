/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;

/**
 *
 * @author Tan Zheliang
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int radius = 10;
        final double PI = 3.14159;
        
        System.out.println("Type in a number");
        radius = sc.nextInt();
        
        double circ = 2 * PI * radius;
        double area = PI * radius * radius;
        System.out.println("1");
        String test = sc.next();
        System.out.println("2");
        String test2 = sc.next();
        System.out.println(test + ' ' + test2);
        System.out.println(area+"cm2");
    }
    
}

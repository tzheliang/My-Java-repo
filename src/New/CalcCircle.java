/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

/**
 *
 * @author Tan Zheliang
 */
public class CalcCircle {
    
    public static void main(String[] args){
        int rad;
        final double PI = 3.14159;
        
        rad = 10;
        
        double area = PI * rad * rad;
        double circumference = 2 * PI * rad;
        
        System.out.println("The circle has a radius of " + rad + "cm.");
        System.out.println("The area of the circle is " + area +"cm2");
        System.out.println("The circumference of the circle is " + circumference + "cm");
    }
}

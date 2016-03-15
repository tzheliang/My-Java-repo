/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;
import java.util.*;
/**
 *
 * @author Tan Zheliang
 */
public class lolwat {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        double value, finalNum = 0;
        System.out.print("Enter a value for N: ");
        value = sc.nextDouble();
        do {
            System.out.println("Enter 1 to calculate the square of N.");
            System.out.println("Enter 2 to calculate the cube of N.");
            System.out.println("Enter 3 to calculate the square root of N.");
            System.out.println("Enter 4 to calculate the reciprocal of N.");
            System.out.println("Enter 0 to quit.");
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    finalNum = value * value;
                    System.out.printf("The value of N is %6.2f.\n", finalNum);
                    break;
                case 2:
                    finalNum = value * value * value;
                    System.out.printf("The value of N is %6.2f.\n", finalNum);
                    break;
                case 3:
                    finalNum = Math.sqrt(value);
                    System.out.printf("The value of N is %6.2f.\n", finalNum);
                    break;
                case 4:
                    finalNum = 1 / value;
                    System.out.printf("The value of N is %6.2f.\n", finalNum);
                    break;
                case 0:
                    System.out.println("Finish!");
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            
        } while ( choice != 0 ); 
    }
}

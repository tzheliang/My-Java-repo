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
public class secondfeb {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score, count = 1, times;
        double total = 0,average;
        
        System.out.print("How many scores?: ");
        times = sc.nextInt();
        
        while (count <= times){
            System.out.printf("Enter the score %d : ", count);
            score = sc.nextInt();
            total += score;
            count += 1;
        }
        
        average = total / times;
        
        System.out.printf("The average of all %d scores is %4.2f.\n",times, average);
    }
}

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
public class FortuneTeler {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double answer;
        String reply = "";
        System.out.println("Welcome to Madam Zorra's hut...");
        char choice = 'y';
        do {
            System.out.println("Enter your question: \n");
            answer =(0 + (int)(Math.random() * 4) + 1);  
            int newAnswer = (int) answer;
            switch (newAnswer){
                case 1:
                    reply = "Yes, definitely";
                    break;
                case 2:
                    reply = "Of course not";
                    break;
                case 3:
                    reply = "Not now, but in the future";
                    break;
                case 4:
                    reply = "With a bit of hardwork";
                    break;
            }
            
            sc.nextLine();
            
            System.out.println("The answer is: " + reply);
            System.out.println("Would you like to ask again? Y/ N");
            choice = sc.next().charAt(0);
            sc.nextLine();
            
        } while (choice == 'y');
        

    }
}
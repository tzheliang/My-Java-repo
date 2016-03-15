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
public class guessing {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        boolean correct = false, computer = false;
        int num = (int)(1 + Math.random() * 100);
        int guess;
        char again;
        int count = 1;
        int answer, playerCount= 0, computerCount = 0, counter = 0;
        System.out.println("I am thinking of a number from 1 to 10. You have three guesses for this number.");
        while (correct == false && count <= 5 ){
            System.out.println("Guess " + count + ": ");
            answer = sc.nextInt();
            if (answer == num){
                correct = true;
                playerCount ++;
                System.out.println("Congratulations!");
                System.out.println("Would you like to try again (Y/N): ");
                again = sc.next().charAt(0);
                if (again == 'y' || again == 'Y'){
                    correct = false;
                    count = 1;
                    num = (int)(1 + Math.random() * 100);
                    counter = 0;
                    computer = false;
                }
                System.out.println("Enter a value for the computer to guess");
                guess = sc.nextInt();
                while (counter < 5 && computer == false ){
                    int computerGuess = (int)(1 + Math.random() * 100);
                    System.out.println("The computer guesed: " + computerGuess);
                    if (computerGuess == guess){
                        System.out.println("Computer wins");
                        computerCount ++;
                        computer = true;
                    }
                    else {
                        counter ++;
                        if (counter == 5){
                            System.out.println("The computer couldn't get it right.");
                        }
                    }
                }
            }
            else{
                if (answer > num){
                    System.out.println("Too high");
                }
                else {
                    System.out.println("Too low");
                }
                count += 1;
                System.out.println("No, try again.");
                if (count == 6){
                    System.out.println("You lose! The answer is " + num + "." );
                    System.out.println("Enter a value for the computer to guess");
                    guess = sc.nextInt();
                    while (counter < 5 && computer == false){
                        int computerGuess = (int)(1+ Math.random() * 100);
                        System.out.println("The computer guessed: " + computerGuess);
                        if (computerGuess == guess){
                            System.out.println("Computer wins");
                            computerGuess ++;
                            computer = true;
                        }
                        else {
                            counter ++;
                            if (counter == 5){
                                System.out.println("The computer couldn't get it right");
                            }
                        }
                    }
                    System.out.println("Would you like to try again (Y/N): ");
                    again = sc.next().charAt(0);
                    if (again == 'y' || again == 'Y'){
                        correct = false;
                        count = 1;
                        num = (int)(1 + Math.random() * 100);
                        counter = 0;
                        computer = false;
                    }
                }
            }
        }
        System.out.printf("The computer has %d wins.\nThe player has %d wins.\n", computerCount, playerCount);
    }
}

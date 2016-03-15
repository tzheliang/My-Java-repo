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
public class NutritionAdvisor {
    
    static Scanner sc;
    
    public static void main (String[] args) {
         sc = new Scanner(System.in);
         
         for (int i = 3; i <= 20; i+= 3)
       System.out.println(i); 
		
		System.out.print("Please enter your name:");
		String name = sc.nextLine();
                System.out.println("Please enter your gender");
                char gender = sc.next().charAt(0);
                sc.nextLine();
                System.out.println("Please enter your age");
                int age = sc.nextInt();
		System.out.print("Please enter your height in meters :");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("Please enter your weight in kg :");
		double weight = sc.nextDouble();
		sc.nextLine();
                System.out.println("Please enter your activity.:");
                System.out.println("1. Sedantary/No exercise\n2. Light exercise"
                        + "/Sports 2-3 days/week\n3. Moderate exercise/Sports 4-5"
                        + " days/week\n4. Very active/Sports 6-7 days/week");
                int choice = sc.nextInt();
		
		double BMI = bMI.getBMI(height, weight);
                double BMR = bMI.getBMR(gender, weight, height, age);
                double calories = bMI.getCalories(BMR, choice );
		System.out.println("Thank you. \n\nYour BMI value is " + BMI);
                String bodyType = bMI.getBodyType(BMI);
                System.out.println("Your BMR is " + BMR);
                System.out.println("Your body type is " + bodyType);
                System.out.println("You require " + calories + " calories in a day.");
                
		
	}

}

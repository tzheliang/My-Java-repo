/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tan Zheliang
 */
public class bMI {
    // main method
	public static void main(String[] args) {
		
		double h = 1.82;
		double w = 75;
                int age = 20;
                char gender = 'M';
		double BMI = getBMI(h,w);
		System.out.printf("A user with height %.2fm and weight %.2fkg", h,w);
		System.out.printf(" has a BMI of %.2f\n", BMI );
                System.out.printf("The user is %s.\n", getBodyType(BMI));
                System.out.printf("The user has a BMR of %.2f.\n", getBMR(gender,w,h,age));
		
	}

	// A method that returns BMI given the height and weight
	public static double getBMI(double height, double weight)
	{   // complete the method body 
            double bmi = weight / (height * height);
            return bmi;

	}
        
        public static String getBodyType (double BMI){
            String bodyType;
            if (BMI < 18.5){
                bodyType = "Underweight";
            }
            else if (BMI >= 18.5 && BMI <= 24.9){
                bodyType = "Normal weight";
            }
            else if (BMI >= 25 && BMI <= 29.9){
                bodyType = "Overweight";
            }
            else {
                bodyType = "Obese";
            }
            
            return bodyType;
        }
        
        public static double getBMR(char gender,double weight, double height, int age){
            double BMR = 0, heightCM;
            heightCM = height * 100;
            switch (gender){
                case 'M': case 'm': 
                    BMR = 66 + (13.7 * weight) + (5 * heightCM) - (6.8 * age);
                    break;
                case 'F': case 'f':
                    BMR = 655 + (9.6 * weight) + (1.8 * heightCM) - (4.7 * age);
                    break;
            }
            
            return BMR;
        }
        
        public static double getCalories(double BMR, int activity){
            double calories =0;
            switch (activity){
                case 1:
                    calories = BMR * 1.2;
                    break;
                case 2:
                    calories = BMR * 1.375;
                    break;
                case 3:
                    calories = BMR * 1.55;
                    break;
                case 4:
                    calories = BMR * 1.725;
                    break;
        }
            return calories;
    } 
        
}





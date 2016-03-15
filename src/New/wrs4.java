package New;
/* ExamReport.java
 * This program calculates the average marks for students in a subject.
 * Written by:
 * Date:
 */
import java.util.*;
public class wrs4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
                double mark;
                char choice = 'y';
                while (choice == 'y'){
                double highest = 0;
		System.out.println("How many students ");
                int studs = sc.nextInt();
                sc.nextLine();
                
		System.out.println("Enter subject code");
		String code = sc.nextLine();
		double total = 0.0;
		int count, pass = 0, fail = 0;
		for (count = 1 ; count <= studs ; count++)
		{
                    do{
			System.out.println("Enter mark for student " + count);
			mark = sc.nextDouble();
                        if (mark > 100 || mark < 0 ){
                            System.out.println("Error!");
                        }
                        else{
                            if (mark <= 40){
                                fail++;
                            }
                            else{
                                pass++;
                            }
                            
                            if (mark > highest){
                                highest = mark;
                            }
                        }
                    } while (mark > 100 || mark < 0 ); 
                    
                    total += mark;
		}
		double average = total / studs;
		System.out.printf("For %s the average mark of %d students is %.2f%n", code, studs , average);
                System.out.printf("%d student(s) passed and %d student(s) failed for %s.%n", pass, fail, code);
                System.out.printf("For the subject %s, the highest test score is %4.2f.\n", code, highest);
                System.out.println("Would you like to count the marks of another subject?");
                System.out.println("Enter Y or N");
                choice = sc.next().charAt(0);
                }
                System.out.println("Finish");
	}
                
}

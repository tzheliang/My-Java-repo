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
public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        String name;
        double score;
        
        for (int i = 0 ; i < students.length; i++) {
            System.out.println("Enter name of student " + (i+1));
            name = sc.nextLine();
            System.out.println("Enter score of student " + (i+1));
            score = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(name,score);
        }
        
        System.out.println("Enter the grade you wish to find");
        String grade = sc.nextLine();
        
        double total = 0;
        double highest = 0;
        int highestPos = -1;
        for (int i = 0 ; i< students.length; i++) {
            total += students[i].getScore();
            if (students[i].getScore() > highest){
                highest = students[i].getScore();
                highestPos = i;
            }
            if (students[i].getGrade().equals(grade)){
                System.out.println(students[i]);
            }
        }
        double average = total / 5;
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
        System.out.println("The student " + students[highestPos] + " has highest score");
        
    }
}

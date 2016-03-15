/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tan Zheliang
 */
public class Student {
    
    private String name;
    private double score;
    
    public Student(String inName, double inScore){
        name = inName;
        score = inScore;
    }
    
    public void setName(String inName) {
        name = inName;
    }
    
    public void setScore(double inScore) {
        score = inScore;
    }
    
    public String getName() {
        return name;
    }
    
    public double getScore() {
        return score;
    }
    
    public String getGrade() {
        if (score < 50) 
            return "FL";
        else if (score < 60)
            return "PS";
        else if (score < 70) 
            return "CR";
        else if (score < 80)
            return "DI";
        else
            return "HD";
    }
    
    public String toString() {
        return "Student name: " + name + " has score of " + score + ".";
    }
}

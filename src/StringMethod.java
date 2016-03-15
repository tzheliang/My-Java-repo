/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Tan Zheliang
 */
public class StringMethod {
    public static void main(String[] args) {
        
                int charCount = 0;
                String newName = "";
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Please enter your name :");
		String userName = sc.nextLine();
                String lowerName = userName.toLowerCase();
                
                for (int i = 0 ; i < lowerName.length(); i++){
                    if (lowerName.charAt(i) >= 'a' && lowerName.charAt(i) <= 'z') {
                        charCount += 1;
                    }
                }
                
                for (int i = userName.length()-1 ; i >= 0; i--) {
                    newName += lowerName.charAt(i);
                }
                
                int lastIndex = userName.indexOf(" ");
                if (lastIndex == -1)
                    lastIndex = userName.length();
                String firstName= userName.substring(0, lastIndex);
                
                System.out.print("Wow, " + userName);
		System.out.print(", your name is " + userName.length());
		System.out.print(" characters long (if I count the spaces).\n");
                System.out.printf("Your name is actually %d characterse long\n", charCount);
                System.out.println("Your name backwards is " + newName);
                System.out.println("Your first name is " + firstName);
                
                
                System.out.println("Enter you friend's name!");
                String friendName = sc.nextLine();
                
                if (friendName.startsWith(firstName)) {
                    System.out.println("Your friend's name is the same as yours!");
                    
                }
                else {
                    System.out.println("You friend's name is not the same as yours.");
                }
                
                System.out.println("Your last name is " + getLastName(userName));
                if (friendName.endsWith(getLastName(userName))) {
                    System.out.println("You have same last names");
                }
                else {
                    System.out.println("You have different last names");
                }
                
                if (userName.equalsIgnoreCase(friendName)) {
                    System.out.println("You and your friend has the same names");
                    
                } else {
                    System.out.println("Your names in order are:");
                    if (userName.compareTo(friendName) < 0) {
                        System.out.println(userName);
                        System.out.println(friendName);
                    } else {
                        System.out.println(friendName);
                        System.out.println(userName);
                    }
                }

	}
    
    // A method that returns the last word in a String
	public static String getLastName(String aName)
	{
		String remainingString = aName;
		int spacePos = remainingString.indexOf(" ");	// find the position of the     								// first space
		while (spacePos != -1)	// there is a space
		{
			remainingString = remainingString.substring(spacePos + 1);// get the substring of the 
 								// rest of the name after 
								// the space
			spacePos = remainingString.indexOf(" ");
								   // find the next space

		}
		return remainingString;
	}
}

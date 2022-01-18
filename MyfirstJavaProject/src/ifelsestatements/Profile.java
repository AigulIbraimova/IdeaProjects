package ifelsestatements;

import java.util.Scanner;

public class Profile {
public static void main(String[] args) {
	
	String color = "purple";
	color.contentEquals("red");
	int size = color.length();
	System.out.println(size);
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your password to create");
	String password =input.nextLine();
	int lengthOfPassword = password.length();
	
	if(lengthOfPassword >=5 && lengthOfPassword <=12);

	
}
}

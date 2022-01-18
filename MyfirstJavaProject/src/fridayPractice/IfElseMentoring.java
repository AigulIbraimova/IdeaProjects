package fridayPractice;

import java.util.Scanner;

public class IfElseMentoring {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your child's age");
		String age =input.nextLine();
		//"My child's age is: 13;
		int indexOfcolon = age.indexOf(":");
		String childAge = age.substring(indexOfcolon +2);
		int name = Integer.valueOf(childAge);
		if(name <5) {
			System.out.println("Go to preschool");
		}else if(name >5);
		if(name >=5 && name <9) {
			System.out.println("Go to the elementary school");
		}else if(name >=10 && name <=13) {
			System.out.println("Go to the middle school");
		}else if(name >=14 && name <=18) {
			System.out.println("Go to the high school");}
	   else {
				System.out.println("Go to the college");
			}
		
				
			
				
		
		
		
		
		
		
	}

}

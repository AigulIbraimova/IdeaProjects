package mondayProject;

import java.util.Scanner;

public class doWhileTask3 {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		String answered = "";
		int counterPositiveNum =0;
		int counterNegativeNum =0;
		int counterZero =0;
	
       do {
    	   System.out.println("Enter the number:");
    	   int num = input.nextInt();
    	   input.nextLine();
    	   System.out.println("Do you want to continue y/n?");
    	   
    	   String answer = input.nextLine();
    	   answered = answer;
    	   if(num > 0) {
    		   counterPositiveNum++;
    	   }
    	   if(num < 0) {
    		   counterNegativeNum--;
    	   }
    	   if(num == 0) {
    		   counterZero++;
    	   }
    	   
       }while(answered.equalsIgnoreCase("y"));
       System.out.println("Positive numbers:" + counterPositiveNum);
       System.out.println("Negative numbers:" + counterNegativeNum);
       System.out.println("Zero numbers:" + counterZero);
       
    	   
       
	
		
	}

}

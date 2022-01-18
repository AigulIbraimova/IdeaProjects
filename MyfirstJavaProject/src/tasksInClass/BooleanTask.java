package tasksInClass;

import java.util.*;

public class BooleanTask {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int time;
		boolean campusOpen;
		
		System.out.println("Please enter the time to check cumpus hours.");
		
		time = input.nextInt();
		
		if(time >= 0 && time < 24) {
			
			if(time >= 8 && time < 24) {
				campusOpen = true;
			}
		    else {
			  campusOpen = false;
		}
			System.out.println("Campus open:" +  campusOpen);
			
		}		
		
		
		else {
			System.out.println("Invalid time. Try again");
		}
	}
	

}

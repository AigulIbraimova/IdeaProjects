package tasksInClass;

import java.util.Random;
import java.util.Scanner;

public class BooleanRandom {
	public static void main(String[] args) {
		
		Scanner tr =new Scanner(System.in);
		
		Random random = new Random();
		
		boolean sent;
		boolean delivered;
		String message;
		
		System.out.println("Enter message : ");
		message = tr.nextLine();
		
		int r = random.nextInt(10);
		System.out.println("Random number : " + r);
		
		if(r % 2 == 0)
		{
			delivered = true;
		} 
		else 
		{
			delivered = false;
		}
		
		System.out.println("Messege:" + message);
		//System.out.println("Sent:" + sent);
		System.out.println("Delivered:" + delivered);
		
	}		
}
		
		


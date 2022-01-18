package tasksInClass;
import java.util.*;

public class SecretNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String message;
	    boolean sent;
		System.out.println("Please enter your message");
		message =  input.nextLine();
		
		if(message.length()>=15) 
		{
			sent = true;
		}
		else 
		{
			sent = false;
		}
		System.out.println("Message:" + message);
		System.out.println("Sent:" + sent);
		
		
				
		
		
	}

}

package methods;

import java.util.Random;

public class RandomTasc3 {
	public static void main(String[] args) {
		createUserName("Aigul", "Ibraimova");
		
	}

	public static void createUserName(String firstName, String lastName) {
		Random rand = new Random();
		int r = rand.nextInt(100);
		firstName =firstName.toLowerCase();
		lastName =lastName.toLowerCase();
		String userName = firstName + lastName + r;
		System.out.println(userName);
		
	}
}

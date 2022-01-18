package constructorsClassTascs;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		DebitCard dc = new DebitCard("John Smith", "1234567890123456","Visa", 100, 478.1);
		System.out.println(dc.type);
		Item item1 = new Item("Controller", 8);
		item1.info();
				
		
	}

}

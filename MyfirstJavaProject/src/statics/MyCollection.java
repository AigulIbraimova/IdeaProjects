package statics;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {
	static Scanner input = new Scanner(System.in);

	public static ArrayList<String> getStringList() {
		ArrayList<String> words = new ArrayList<>();
		String response;
		do {
			System.out.println("Please enter String");
			String s = input.nextLine();
			words.add(s);
			System.out.println("Do you wanna continue Y/N");
			response = input.nextLine();
		} while (response.equalsIgnoreCase("y"));
		System.out.println("Your list of string returned");
		return words;

	}

}

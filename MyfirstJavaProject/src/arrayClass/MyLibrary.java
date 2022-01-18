package arrayClass;

import java.util.Arrays;
import java.util.Scanner;

public class MyLibrary {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String myBooks [] = {"OCA","Zero to one", "Unbeatable mind", "100$ startup", "Mind Power"};
		 
		System.out.println("Please enter the book to replace");
		String book = input.nextLine();
		System.out.println("Please enter the new book");
		String newBook = input.nextLine();
		Arrays.sort(myBooks);
		System.out.println(Arrays.toString(myBooks));
		int result = Arrays.binarySearch(myBooks, book);
		if(result >= 0) {
			myBooks[result] = newBook;
		}
		System.out.println(Arrays.toString(myBooks));
		
		
		
		
	}

}

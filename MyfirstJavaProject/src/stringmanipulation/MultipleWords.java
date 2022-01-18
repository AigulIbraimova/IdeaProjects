package stringmanipulation;

import java.util.Scanner;

public class MultipleWords {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String str;
     boolean multipleWords;
		
	System.out.println("Please enter the string");
		
		str= input.nextLine();
//		boolean check = str.contains("se");
		
		if(str.contains(" ")) {
			multipleWords = true;
		}else {
			multipleWords = false;
		}
		System.out.println("Multiple words:" + multipleWords);
	}

}

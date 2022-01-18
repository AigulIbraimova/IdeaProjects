package Array;

import java.util.Scanner;

public class ArrayTask2 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] names = {"James", "John", "Adam", "Elize", "Jamie", "Benzema"};
		int size = names.length;
		System.out.println(size);
		System.out.println("Please enter your keyword");
		String keyword = input.next();
		for(int v = 0; v<size; v++) {
			String name = names[v];
			System.out.println(name.charAt(0));
			if(name.contains(keyword)) {
				System.out.println(name);
			}
		}
		
	}

}

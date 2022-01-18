package loops;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		
//		for(int i =0; i <20; i++) {
//			if(i ==13) {
//				continue;
//			}
//			System.out.println(i);
//		}
		Scanner input = new Scanner(System.in);
		
		
		for(; ;) {   
			System.out.println("Enter name");
			String name =input.nextLine();
			if(name.equals("James")) {
			continue;
		}System.out.println("Good job " + name);
		
		}
		
	}

}

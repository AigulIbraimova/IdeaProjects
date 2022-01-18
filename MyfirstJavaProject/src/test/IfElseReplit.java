package test;

import java.util.*;

public class IfElseReplit {

	public static void main(String[] args) {

		System.out.println("Please enter:");
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();

		if (n.contains("a")) {
			System.out.println("A Perfect");
		}
		else if(n.length() < 5) {
			System.out.println("Please enter different number");
		}
	}
}

package videoPractice;

import java.util.Arrays;
import java.util.Random;

public class Array {

	public static void main(String[] args) {

		String[] names = { "kanat", "aigul", "azamat", "aylin", "adilet", "jasmin", "adilet", "jazgul" };

		System.out.println("Total " + names.length);

		System.out.println(Arrays.toString(names));

		for (int i = 0; i < names.length; i += 2) {
			System.out.println(names[i] + "," + names[i + 1]);
		}
		System.out.println("Male names:");
		for (int m = 0; m < names.length; m += 2) {
			System.out.print(names[m] + ",");
		}
		// System.out.println();
		System.out.println("\nFemail names:");
		for (int n = 0; n < names.length; n++) {
			if (n % 2 != 0) {
				// if(n%2==1)
				if (n == names.length - 1) {
					System.out.println(names[n]);
				} else {
					System.out.print(names[n] + ",");

				}
			}
		}
		Random rand = new Random();
		int r = rand.nextInt(names.length);
		System.out.println("Random: " +names[r]);
		
		for(String name:names) {
			if(name.length()<=5) {
				System.out.print(name.toUpperCase() + ",");
			}
		}

	}

}

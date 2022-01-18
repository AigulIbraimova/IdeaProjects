package Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class names {
public static void main(String[] args) throws FileNotFoundException {
	//print the name that has the length of 5
	//print all the names but empty lines
	
	File file = new File("test.txt");
			Scanner sc=new Scanner(file);        
			while(sc.hasNextLine()){ 
				String name = sc.nextLine().trim();
//				if(name.length() == 5) {
//				System.out.println(name);
//				}
				if(name.isEmpty()) {
					continue;
				}
				System.out.println(name);
			}
		
}
}

package youtube;

import java.util.Arrays;
import java.util.Scanner;

public class AigulPractice {
	public static void main(String[] args) {
		
	
	    Scanner input = new Scanner(System.in);
	    
	    int[] inhabitants = new int[8];
	    
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    
	    int day = 1;
	    String str = "";
	    
	    do {
	   for(int i = 0; i <inhabitants.length; i++) {
		   inhabitants[i] = inhabitants[i]/2;
		  
	   }
	    System.out.println("Day " + day + " ");
	    
	    System.out.println(Arrays.toString(inhabitants));
	    day++;
	    str = Arrays.toString(inhabitants);
	    }while(!str.equals("[0,0,0,0,0,0,0,0]"));
	}
}

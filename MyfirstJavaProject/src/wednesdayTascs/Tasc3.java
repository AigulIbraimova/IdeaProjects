package wednesdayTascs;

import java.util.Arrays;

public class Tasc3 {
	
	public static void main(String[] args) {
		
		int [] grades = {15,-25,33,35,66,44,78,95,98,1,500};
		int max=grades[0];
		int min=grades[0];
		for(int i=0; i<grades.length; i++) {
			if(max<grades[i]) {
				max=grades[i];
				
			}
			if(min>grades[i]) {
				min = grades[i];
			}
			
		}
		System.out.println("Max grade: " +max);
		System.out.println("Min grade: " +min);
		
		
//		Arrays.sort(grades);
//		System.out.println("Min grade is: " + grades[0]);
//		System.out.println("Max grade is: " + grades[grades.length-1]);
		
	}

}

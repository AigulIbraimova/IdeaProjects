package wednesdayTascs;

import java.util.Arrays;

public class Tasc2 {
	
	public static void main(String[] args) {
		
		String [] shows = {"Game of Thrones", "Friends","Prison Break","Doctor Who","Greys Anatomy"};
		Arrays.sort(shows);
		int count =0;
		System.out.println("Sorted list of shows:");
		for(String s:shows) {
			System.out.println("#" +count +" " + s);
			count++;
		}
		
//		for(int i=0; i<shows.length; i++) {
//			System.out.println("#" + i +" " + shows[i]);
//		}
		
		
	}

}

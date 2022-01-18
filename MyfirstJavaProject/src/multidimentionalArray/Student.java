package multidimentionalArray;

import java.util.Arrays;

public class Student {
	
	public static void main(String[] args) {
		String [][] groups = new String[3][];
		String [] team3= {"Adam", "James"};
		String [] team2= {"Benzema", "Bali", "Modric", "Kaylor", "Marcelo"};
		String [] team1= {"Messi", "Alba", "Suarez", "Dembele"};
		groups[0] = team1;
		groups[1] = team2;
		groups[2] = team3;
		
		System.out.println(groups[1][2].charAt(0));
		System.out.println(groups[2][0]);
		System.out.println(groups[0][2]);
		
		System.out.println(Arrays.toString(groups[0]));
		System.out.println(Arrays.toString(groups[1]));
		System.out.println(Arrays.toString(groups[2]));
		
		System.out.println(groups.length);
		for(int i=0; i<groups.length; i++) {
			for(int j=0; j<groups[i].length; j++) {
				System.out.print(groups[i][j] + " ");
			}
			//System.out.println(groups[i].length);
			System.out.println("------");
		}
		
		
	}

}

package nestedLoop;

import java.util.Random;

public class RandomUnique6Numbers {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		String result = "";
		
		for(int i= 0; i<6; i++){
			
			int a = r.nextInt(10);
			
			System.out.print(a);
			
		}
		
	}

}

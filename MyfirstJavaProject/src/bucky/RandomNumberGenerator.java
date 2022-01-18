package bucky;
import java.util.Random;
public class RandomNumberGenerator {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int number=0;
		for(int counter=0; counter<=10; counter++) {
			number=1+rand.nextInt(5);
			System.out.println(number+ " ");
		}
		
	}

}

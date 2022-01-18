package videoPractice;
import java.util.*;
public class ArrayClass {
	
	public static void main(String[] args) {
//		int [] numbers = {5,23,8};
//		Arrays.sort(numbers);
//		for(int num:numbers) {
//			System.out.println("numbers: " + num);
//		}
		
		String [] flowers = {"jasmin","rose","azalia"};
		Arrays.sort(flowers);
		for(String flower:flowers) {
			System.out.println(flower);
		}
		System.out.println(Arrays.toString(flowers));
	}

}

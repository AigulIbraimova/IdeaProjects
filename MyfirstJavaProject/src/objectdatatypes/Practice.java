package objectdatatypes;
import java.util.Random;
public class Practice {
	

	public static void main(String[] args) {
////	Random rand = new Random();	
////	int number;
////	
////	for(int i=1; i<=10; i++) {
////		number=1+rand.nextInt(8);
////		System.out.println(number+ " ");
	//}	
//		System.out.println("index\tvalue");
//		int arr [] = {2,3,6,5,4,7};
//		
//		for(int i=0; i<arr.length; i++) {
//		
//		System.out.println(i+ "\t" + arr[i]);
//		}
		
		int arr [] = {2,4,6,54,7,23,5,6};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("total sum is: " + sum);
	}
}

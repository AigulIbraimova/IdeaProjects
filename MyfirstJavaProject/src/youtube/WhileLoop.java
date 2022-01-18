package youtube;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
//		int banana = 1;
//		while(banana <=3) {
//			System.out.println("Eating banana " + banana);
//			banana++;
//		}
//		System.out.println("No more bananas");
//		
//		Scanner input= new Scanner (System.in);
//		System.out.println("Enter your number");
//		int number =input.nextInt();
//		int count =1;
//		while(count<number) {
//			System.out.print(count + ", ");
//			count+=3;
//		}
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter positive enteger");
		int num = scan.nextInt();
		int total=0;
		while(num>0) {
			total= total+num;
			num= scan.nextInt();
		}
		System.out.println(("Sum of all numbers" +total));
		
	}

}

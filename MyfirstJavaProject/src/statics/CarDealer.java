package statics;

import java.util.ArrayList;

public class CarDealer {
	
	public static void main(String[] args) {
		
		System.out.println(Lexus.totalLexus);
		Lexus l1= new Lexus("ES 350", 2018);
		System.out.println(Lexus.totalLexus);
		System.out.println(Lexus.mileToKm(13));
		
		System.out.println(l1.mileage);
		l1.mileage = 17000;
		Lexus.evaluateCar(l1);
		
		
		ArrayList<String>myList=MyCollection.getStringList();
		System.out.println();
		
	}

}

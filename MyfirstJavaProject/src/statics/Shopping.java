package statics;

import static statics.BestBuy.*;

import java.util.*;


public class Shopping {
	
	public static void main(String[] args) {
		System.out.println(numOfComputers);
		Random r =new Random();
		
		BestBuy b1 = new BestBuy();
		b1.location = "Chicago Downtown";
		BestBuy b2 = new BestBuy();
		b2.location = "Des Plaines Il";
		BestBuy b3 = new BestBuy();
		b3.location = "Ohare Area";
//		System.out.println(b1.location);
//		//How to access static fields/variables
//		BestBuy.numOfComputers = 90;
//		System.out.println(b1.numOfComputers);
//		b3.numOfComputers = 55;
//		System.out.println(b2.numOfComputers);
//		b1.sellComputer();
//		b3.sellComputer();
//		System.out.println(b1.numOfComputers);
		
		
		System.out.println(BestBuy.numOfComputers);
	}

}

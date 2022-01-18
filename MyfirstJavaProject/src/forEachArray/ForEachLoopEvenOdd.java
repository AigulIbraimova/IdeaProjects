package forEachArray;

public class ForEachLoopEvenOdd {
	
	public static void main(String[] args) {
    String [] favoriteFruits = {"Orange","Apples","Pineapple","Mango"};
		
		for(String fruit:favoriteFruits) {
			if(fruit.length() % 2 == 0){
				//if(fruit.length() % 2 == 1)
				System.out.println(fruit);	
			
			}
		}	
	}

}

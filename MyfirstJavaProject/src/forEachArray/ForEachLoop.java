package forEachArray;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		String [] favoriteFruits = {"Orange","Apples","Pineapple","Mango"};
		
		for(String fruit:favoriteFruits) {
			if(fruit.equals("Pineapple")){
				System.out.println(fruit);	
			
			}
		}
		
		
	}

}

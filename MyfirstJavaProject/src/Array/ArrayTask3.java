package Array;

public class ArrayTask3 {
	
	public static void main(String[] args) {
		
  String [] kitchenItems = {"knife","wooden spoons","plates", "cups","forks", "pan", "pot","trash can",
		  "fridge","dishwasher"};
  
		for(int i =0; i<kitchenItems.length; i++) {
			
			if(kitchenItems[i].trim().contains(" ")){
				
				System.out.println(kitchenItems[i]);
			}
		}
		
	}

}

package Array;

public class ArrayTask6 {
	
	public static void main(String[] args) {
		
		String [] cities = {"Chicago", "New York", "Madison", "Miami", "Washington"};
		
		boolean check = true;
		
		for(int i=0; i<cities.length; i++) {
			
             if(cities[i].equals("Chicago ")){
				
				System.out.println("Windy city found");
				check = false;
				break;
				
			}
		}
		
		if (check = false) {
		System.out.println("Windy city not found");
	}	
	int counter = 0;
	for(int i = 0; i < cities.length; i ++) {
		if(cities[i].contentEquals("Chicago")) {
			counter++;
		}

		
	}

}
}
package youtube;

public class VoidPractice2 {
	
	public static void main(String[] args) {
		cook("Steak");
		youWillNeed("Meat,salt,black pepper,tomatoes,onions");
		cookFor(10,"Grilling");
		ready();
		
		
		
	}
	
	public static void cook(String foodName) {
		System.out.println("Today we are cooking- " + foodName + ".");
		
	}
	public static void youWillNeed(String items) {
		System.out.println("We need following items: " + items + ".");
	}
	public static void cookFor(int minutes, String wayOfCooking) {
		System.out.println("You need to cook for " + minutes + " minutes by " + wayOfCooking + ".");
	}
	public static void ready() {
		System.out.println("Meet is ready! Enjoy!");
	}

}

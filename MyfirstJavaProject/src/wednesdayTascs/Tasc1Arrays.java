package wednesdayTascs;

public class Tasc1Arrays {
	public static void main(String[] args) {
		
	String [] carBrands = {"mercedes","bmw","toyota","ferrari"};
	
	for(String cars:carBrands) {
		if(cars.equals("mercedes")) {
			System.out.println(cars+": Luxury-Comfort");
		}else if(cars.equals("bmw")) {
			System.out.println(cars+": Luxury-Sport");
		}else if(cars==carBrands[2]) {
			System.out.println(cars +": Reliable-Cheap");
		}else {
			System.out.println(cars+ ": Super car-Super expensive");
		}
		
		}
	}
}

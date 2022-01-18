package objectdatatypes;

public class Car {
	
	//Characteristics / Properties
	String make;
	int year;
	int mileage;
    boolean sportEdition;
	
	
	
	//Actions / Methods
	public void drive()
	{
		System.out.println(year + " " + make + " is driving");
		mileage+=10;
	}
	public void drive(int mile) {
		System.out.println(year +" "+ make + " is driving " + mile + " miles.");
		mileage += mile;
	}
	public void drive(String destination) {
		System.out.println(year +" "+ make + " is driving to " + destination);
		mileage += 10;
	}
	
	public void info() {
		System.out.println("Make: "+ make);
		System.out.println("Year: " + year);
		System.out.println("Sport edition: "+sportEdition);
		System.out.println("Mileage: "+ mileage);
	}
	
	
	
	
	
	

}

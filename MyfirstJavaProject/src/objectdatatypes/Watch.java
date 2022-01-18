package objectdatatypes;

public class Watch {
	
	String brand  = "Casio";
	String style;
	String color;
	String material;
	double price;
	String type;
	
	public void tick() {
		System.out.println(brand +" is ticking");
		
	}
	public void showTime() {
		System.out.println("Watch is showing the date");
	}

}

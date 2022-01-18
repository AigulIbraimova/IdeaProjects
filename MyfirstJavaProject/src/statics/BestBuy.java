package statics;

public class BestBuy {

	static int numOfComputers;
	String location;

	static String day = "Sunday";

	static {
		System.out.println("Second static block");
	}

	static {
		System.out.println("First static block");
		if (day.contentEquals("Saturday")) {
			numOfComputers = 45;
		} else {
			numOfComputers = 60;
		}

	}

	public void sellComputer() {
		System.out.println("Computer is sold");
		numOfComputers--;

	}

}

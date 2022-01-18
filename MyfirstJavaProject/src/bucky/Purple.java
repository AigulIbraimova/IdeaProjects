package bucky;

public class Purple {
	
	private String girlName;
	
	public Purple(String name) {
		girlName=name;
	}
	
	public void setName(String name) {
		girlName=name;
	}
	
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first girlname was %s\n", getName());
	}

}

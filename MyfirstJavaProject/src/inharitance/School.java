package inharitance;

public class School {
	
	String name;
	String address;
	String type;
	
	public void giveHW() {
		
	System.out.println(this.name + "is giving homework");
		
	}
	
	public void hostEvent(String date) {
		
		System.out.println("Hosting event on" + date);
	}

}

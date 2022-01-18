package bucky;

public class TimeClass {
	
	public static void main(String[] args) {
		
		luna lObj = new luna();
		System.out.println(lObj.toMilitary());
		System.out.println(lObj.toString());
		
		lObj.setTime(13, 27, 6);
		System.out.println(lObj.toMilitary());
		System.out.println(lObj.toString());
		
		
		
	}

}

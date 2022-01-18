package superPackage;

import java.util.Random;

public class Country {
	
	final int population= 5000;
	String name;
	final String capital;
	
	public Country(String cap) {
		this.capital = "Whatever";
	}
	
	public Country() {
		super();
		capital= "something";
	}
	
	public void anthem() {
		System.out.println("Anthem method in Country class");

	}

}

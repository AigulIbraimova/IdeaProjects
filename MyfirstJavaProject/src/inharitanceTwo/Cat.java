package inharitanceTwo;

import inharitance.Animal;

public class Cat extends Animal{
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.eat();
		c.gender = "mail";
		//c.color = "red";
		//Dog d = new Dog();
	}

}

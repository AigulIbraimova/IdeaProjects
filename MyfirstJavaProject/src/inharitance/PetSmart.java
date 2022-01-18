package inharitance;

public class PetSmart {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.color = 45;
		dog.gender = "mail";
		dog.eat();
		dog.animalStatic();
		Dog.animalStatic();
	}

}

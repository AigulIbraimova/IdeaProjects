package objectdatatypes;

public class Petshop {
	
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.age = 3;
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		dog1.bark();
		Dog dog2 = new Dog();
		System.out.println(dog2.age);
	}

}

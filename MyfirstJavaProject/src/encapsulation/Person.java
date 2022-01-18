package encapsulation;

public class Person {

	private String name;
	private String gender;
	private int age;
	private double height;
	private double weight;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("male")){
		this.gender = gender;
	}else {
		System.out.println("Invalid gender");
	}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 0 && age <= 120) {
		this.age = age;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height > 0) {
		this.height = height;
		}else {
			System.out.println("Invalid height");
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight > 0) {
		this.weight = weight;
		}else {
			System.out.println("Invalid weight");
		}
			
		
	}

}

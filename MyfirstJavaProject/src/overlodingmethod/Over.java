package overlodingmethod;

public class Over {
	public static void main(String[] args) {
		draw();
		draw(45);
		draw("Red");
		draw("James", "yellow");
		      //argument
		
	}

	public static void draw(String color) {
		System.out.println(color);
		
	}
	public static void draw(String name, String s) {
		                  System.out.println(name +  " " + s);         //parametr
		
	}
	public static void draw(int num) {
		System.out.println(num);
	}
	public static void draw() {
		
	}
	
}

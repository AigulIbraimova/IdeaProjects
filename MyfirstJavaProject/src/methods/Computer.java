package methods;

public class Computer {
	
	public static void main(String[] args) {
	int m = getMemory();
	System.out.println(m);
	}
     public static int getMemory() {
	System.out.println("Returning the computer memory");
	return 512;
}
}

package method2;

public class Calculator {
	
	public static void main(String[] args) {
		System.out.println(add(324,56) + " " + multiply(34, 3));
		int i = subtract(34, 23);
	System.out.println(i);
		System.out.println(multiply(9, 7));
		System.out.println(divide(10, 2));
		System.out.println(i);
		
		
	}
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static int subtract(int a, int b) {
		int sum = a - b;
		return sum;
	}
	
	public static int multiply(int a, int b) {
		int sum = a * b;
		return sum;
	}
    public static int divide(int a, int b) {
    	int sum = a/b;
    	return sum;
    }
}

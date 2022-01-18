package overlodingmethod;

public class VarTasc4 {
	
	public static void main(String[] args) {
		printArray(23,34,65,2,54,7,4,2);
		welcome("Aigul");
	}
	
	public static void welcome(String name) {
		System.out.println("WELcome " + name);
	}
	public static void printArray(int n, int...nums) {
		for(int i:nums) {
			System.out.println(i);
		}
	}

}

package methods;

public class OddNumbersMethodTasc {
	
	public static void main(String[] args) {
		printOddNumbers();
	}
	
public static void printOddNumbers() {
	for(int n=0; n<=50; n++) {
		if(n % 2==1) {
			System.out.print(n + " ");
		}
	}
}
}

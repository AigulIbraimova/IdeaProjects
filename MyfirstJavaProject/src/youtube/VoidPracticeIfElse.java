package youtube;

public class VoidPracticeIfElse {
	public static void main(String[] args) {
		getLarger(140,140);
	}

	public static void getLarger(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1);
		}else if(num2>num1) {
			System.out.println(num2);
		}else {
			System.out.println("Numbers are equal " + num1);
		}                                           //num2
	}
}

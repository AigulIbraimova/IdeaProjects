package videoPractice;

public class VoidPractice {
	public static void main(String[] args) {
		steps(0);
		steps(5);
		steps(-3);
	}
	
	public static void steps(int times) {
		if(times == 0) {
			System.out.println("Sit");
		}else if(times > 0) {
			for(int i=1; i<= times; i++) {
				System.out.println("Step " + i);
			}
		}else if(times < 0) {
			for(int n=1; n<=times * (-1); n++) {
				             //n<=-times;
				System.out.println("Jump " + n);
			}
		}
	}

}

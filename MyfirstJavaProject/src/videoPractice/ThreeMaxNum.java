package videoPractice;

public class ThreeMaxNum {
	
	public static void main(String[] args) {
		int max = getMax3(73,9,2);
		System.out.println(max);
		
		 max = getMax3(7,10,2);
		System.out.println(max);
		
		 max = getMax3(160,90,240);
		System.out.println(max);
		
	}
	
	public static int getMax3(int num1, int num2, int num3) {
		if(num1>=num2 && num1>=num3) {
			return num1;
		}else if(num2>=num1 && num2>=num3) {
			return num2;
		}else {
			return num3;
		}
	}

}

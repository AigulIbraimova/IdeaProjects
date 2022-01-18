package videoPractice;

public class MaxNumTasc {
	
	public static void main(String[] args) {
		System.out.println(getMax(100,150));
		//int myMaxNum = getMax(32,28);
		//System.out.println(myMaxNum);
	}
	
	public static int getMax(int num1, int num2) {
		int largest;
		if(num1>num2) {
			largest = num1;
		}else {
			largest = num2;
		}
		return largest;
	}

}

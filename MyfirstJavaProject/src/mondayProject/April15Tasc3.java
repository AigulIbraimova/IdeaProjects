package mondayProject;

public class April15Tasc3 {
	
	public static void main(String[] args) {
		int numbers [] = {2,3,65,7,25,11,5,9};
		
		System.out.println(findSecondMax(numbers));
		
	}
	public static int findSecondMax(int [] arr) {
		int counter = arr[0];
		int secondMax = arr[0];
		for(int i = 0; i < arr.length; i++) {					
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					counter++;
				}
				}
			if(counter == 1) {
				secondMax = arr[i];
				break;
			}
			counter = 0;
		}
		return secondMax;
	}

}

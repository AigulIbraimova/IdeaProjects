package overlodingmethod;

public class Tasc1 {
	
	public static void main(String[] args) {
		int [] ages = {23,34,45,56,18};
		System.out.println(arrayContains(ages,23));
		                                    //21
	}
	public static boolean arrayContains (int [] arr, int target) {
		for(int i:arr) {
			if(i == target) {
				return true;
			}
		}
		return false;
	}

}

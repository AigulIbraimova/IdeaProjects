package youtube;

public class MentoringTasc4 {
	
	public static void main(String[] args) {
		int [] nums = {3,2,6,9,5,34};
		System.out.println(binarySearch(nums, 100));
		
	}
	
	public static int binarySearch(int[] arr, int num) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid] == num) return mid;
			else if(num <arr[mid]) end = mid-1;
			else start = mid+1;
		}
		
		   return -1;
	}

}

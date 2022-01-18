package method2;
import java.util.Arrays;
public class SubtractingTasc {
	public static void main(String[] args) {
		String searchResult = "About 691,000,000 results (0.78 seconds)";
		String result = getNumResult(searchResult);
		System.out.println(result);
		String time = getTimeResult(searchResult);
		System.out.println(time);
	}	
		public static String getNumResult(String searchResult) {
			String [] arr = searchResult.split(" ");
			System.out.println(Arrays.toString(arr));
			String str = arr[1];					//second approach is without using loop
			String storage = "";					// str = str.replace(",", "");
			for(int i = 0; i < str.length(); i++) { //return str;
				if(str.charAt(i) == ',') {
					continue;
				}
				storage += str.charAt(i);
			}
			return storage;
		}
		
		public static String getTimeResult(String searchResult) {
			int start = searchResult.indexOf("(");
			int end = searchResult.indexOf(")");
			String result = searchResult.substring(start+1, end);
			return result;
		}

}

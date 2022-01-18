package overlodingmethod;

import java.util.Arrays;

public class StringArrayTasc2 {
	
	public static void main(String[] args) {
		String [] words = {"hi","bye","yes"};
		String [] newWords = addElement(words, "Hello");
		System.out.println(Arrays.toString(newWords));
	}
	
	public static String [] addElement(String [] arr, String word) {
		String [] newArr = new String[arr.length + 1];
		for(int i = 0; i <arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length-1]=word;
		return newArr;
	}

}

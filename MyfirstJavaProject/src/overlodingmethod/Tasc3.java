package overlodingmethod;

import java.util.Arrays;

public class Tasc3 {
	
	public static void main(String[] args) {
		String [] words = {"hi","bye","yes"};
		String [] newWords = addElement(words, "Toyota", 2);
		System.out.println(Arrays.toString(newWords));
		
	}
	public static String [] addElement(String [] arr, String word, int index){
		String [] newArr = new String [arr.length + 1];
		int in = 0;
		for(int i = 0; i < newArr.length; i++) {
			if(i == index) {
				newArr[i] = word;
			}else {
				newArr[i] = arr[in];
				in++;
			}
		}
		return newArr;
	}

}

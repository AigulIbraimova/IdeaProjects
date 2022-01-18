package videoPractice;

import java.util.Arrays;

public class Split {
	
	public static void main (String[] args) {
		
//		String words = "luna, star, sky, cloud, sun";
//		String [] myWords = words.split(",");
//		System.out.println(Arrays.toString(myWords));
//		System.out.println("total: " + myWords.length);
//		System.out.println(myWords[2]);
//		System.out.println(myWords[myWords.length-1]);
//		
//		System.out.println();
//		for(String word:myWords) {
//			System.out.println(word);
//			System.out.println();
//	}
		
		String diceResult = "1 - 20 of 1,245 positions";
		String [] myResultArray = diceResult.split(" ");
		System.out.println(myResultArray.length);
		System.out.println(myResultArray[4]);
		String [] myResultArray1= diceResult.split("of");
		System.out.println(myResultArray1.length);
		System.out.println(myResultArray1[0].trim());
		System.out.println(myResultArray1[1].trim());
		System.out.println();
		
		String word = "java";
		char [] charToArray = word.toCharArray();
		for(char ch:charToArray) {
			System.out.println(ch);
		}
		
		
		
	}

}

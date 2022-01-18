package mondayProject;

import java.util.Arrays;

public class April15Tasc2 {
	
	public static void main(String[] args) {
		String word1 = "IlkinHasanov";
		String word2 = "HasanovIlkin";
		System.out.println(isAnagram(word1,word2));
		
	}
	
	public static boolean isAnagram(String word1, String word2) {
		
		word1 = word1.toLowerCase().trim().replace(" ", "");
		word2 = word2.toLowerCase().trim().replace(" ", "");
		
		String [] arr1 = word1.split("");
		String [] arr2 = word2.split("");
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].equals(arr2[i])) {
				continue;
			}
			return false;
		}
		return true;
	}
	

}

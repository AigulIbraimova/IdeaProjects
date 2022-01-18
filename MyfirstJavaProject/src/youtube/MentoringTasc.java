package youtube;

import java.util.Arrays;

public class MentoringTasc {
	
public static void main(String[] args) {
        
        String str = "1234abc";
        System.out.println(Arrays.toString(stringNumsPalindrome(str)));
        
    }
    
    public static String [] stringNumsPalindrome(String numbers) {
        
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) < 48 || numbers.charAt(i) > 57) {
                numbers = numbers.replace(numbers.charAt(i) + "", "0");
            }
        }
            
            String [] numStr = new String [numbers.length() + 1];
            
            for (int i = 0; i < numbers.length(); i++) {
                numStr[i] = numbers.charAt(i) + "";
            }
            
            for (int i = 0; i < numStr.length / 2; i++) {
                if (!numStr[i].equals(numStr[numStr.length - 2 - i])) {
                    numStr[numStr.length - 1] = "Not a palindrome";
                    return numStr;
                }
            }
            numStr[numStr.length - 1] = "Is a palindrome";
            return numStr;
        }
    }
    
    



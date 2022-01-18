package mondayProject;

import java.util.Arrays;

public class April15Tasc1 {

	public static void main(String[] args) {
		String str = "123sdbh4563423456765432sdfgh!@#";   
	    System.out.println(Arrays.toString(extractNum(str)));   ;   
	    	
		
	}
	
	public static int [] extractNum(String str) {
		String sum = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				sum = sum + str.charAt(i) + ",";
			}
		}
		sum = sum.substring(0,sum.length()-1);
		String [] split = sum.split(",");
		int [] numbers = new int[split.length];
		for(int j = 0;j < split.length;j++) {
		       numbers[j] = Integer.valueOf(split[j]);
		    }
		    return numbers;
		
	}

}

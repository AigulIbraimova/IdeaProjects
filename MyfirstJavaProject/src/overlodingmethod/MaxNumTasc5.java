package overlodingmethod;

public class MaxNumTasc5 {
	
	public static void main(String[] args) {
		
	}
	
	public static String toString(String [] words) {
		// [ele1, ele2, ele3,]
		String result = "[";
		for(int i = 0; i<words.length; i++) {
			if(i == words.length-1) {
				result += words[i] + "]";
			}else {
				result += words[i] + ",";
			}
		}
		return result;
	}

}

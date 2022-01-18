package splitArray;

public class WordCounterTasc2 {
	
	public static void main(String[] args) {
		
		String str = "Write a program that creates a group of given size program";
        String [] words = str.split(" ");
        int counter = 0;
        for(String word:words) {
        	if(word.equals("program")) {
        		counter++;
        	}
        }
        System.out.println(counter);
	}

}

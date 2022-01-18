package forEachArray;

public class WithUpperCaseArray {
	
	public static void main(String[] args) {
		String [] groceries = {"Bread","Cucumber","Apples","Orange","cookies","Cake"};
		int counter = 0;
		for(String grocery:groceries) {
			
			char c = grocery.charAt(0);
		//	int i = c;
			if(c >= 97 && c <= 122) {
				counter++;
			}
		}
		
		System.out.println("There are " + counter +" words with upper case out of "+counter);
	}

}

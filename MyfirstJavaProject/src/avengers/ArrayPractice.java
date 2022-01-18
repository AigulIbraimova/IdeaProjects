package avengers;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
	
	
	String [] myName = {"A","B","C","D"};
//	
//	for(String name:myName) {
//		System.out.println(name);
//		
////	}
//		for(int i=0; i<myName.length; i++) {
//			System.out.println(myName[i]);
			
			for(int i=myName.length-1; i>=0; i--) {
				System.out.print(myName[i]);
			}
		
	}
}

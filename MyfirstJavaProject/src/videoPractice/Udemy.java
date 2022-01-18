package videoPractice;


public class Udemy {
	
	public static int bloks(int levels) {
		int total=0;
		levels =9;
		for(int i=0; i<=levels; i++) {
			total=total+(i*i);
		}
		return total;
	}
	
	public static void main(String[] args) {
	     
		System.out.println(bloks(12));
	}
	
	
		
}

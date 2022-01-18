package nestedLoop;

public class NestedLoopTask {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 12; i++) {
			for( int j =0; j<i; j++) {
				//System.out.println("i:" +i+" j:" +j);
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}

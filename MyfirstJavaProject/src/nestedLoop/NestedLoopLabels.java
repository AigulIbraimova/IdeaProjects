package nestedLoop;

import java.util.Scanner;

public class NestedLoopLabels {
	
	public static void main(String[] args) {
		
//		myOuterLoop:
//			for(int i = 0; i < 5; i++) {
//				myInnerLoop:
//					for(int j = 0; j < 3; j++) {
//						System.out.println(j);
//						if(j == 1) {
//							break myOuterLoop;
//						}
//					}
//			}
		
		myOuterLoop:
		for(int i =0; i<5; i++) {
			myInnerLoop:
				for(int j =0; j<10; j++) {
					System.out.println(j);
					if(j==5) {
						
						continue myInnerLoop;
					}
					if(j==7) {
						
						break myOuterLoop;
					}
					System.out.print(j);
				}
		}
		
		
		
	}

}

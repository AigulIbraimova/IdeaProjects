package youtube;

public class NestedLoopPractice {
	
	public static void main(String[] args) {
//		for (int i=0; i<4; i++) {
//			System.out.println();
//			for (int j=0; j<3; j++) {
//				System.out.print(" |Row" + i+"-Column" +j);
//			}
//		}
//		int colomns [] = {1,2,3};
//		int rows [] = {1,2,3,4};
//		
//		for(int row:rows) {
//			System.out.println();
//			
//			for(int colomn:colomns) {
//				 System.out.print(" |row" + row + "-colomn" + colomn);
//			 }
//		}
		 int i =0;
		 while(i<3) {
			 i++;
			 System.out.println();
			 int j=0;
			 while(j<2) {
				 j++;
				 System.out.print(" |Row" + i + "=Colomn" +j);
			 } 
		 }
		
	}

}

package loops;

public class Skipping {
	public static void main(String[] args) {
		for(int i = 0; i <50; i++) {
//			if(i % 10 ==3) {
//				continue;
//			}
			
			String str =i+"";
			if(str.endsWith("3")) {
				continue;
			}
			System.out.println(i);
		}
			
		
	}
	

}

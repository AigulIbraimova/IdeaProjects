package forEachArray;

public class ValidEmailArrayTask {
	
	public static void main(String[] args) {
		
		String [] emails = {"agdhgdh.@gmail","14354@.gmail","sgd","hgchsg","gcjdhgc"};
		
		for(String email:emails) {
			if(email.contains("@") && email.contains(".")) {
				System.out.println(email);
			}
		}
		
		
		

	}

}

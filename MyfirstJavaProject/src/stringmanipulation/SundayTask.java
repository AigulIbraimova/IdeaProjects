package stringmanipulation;

public class SundayTask {
	public static void main(String[] args) {
		
		String num = "Account number: 284766487678";
		
		int i = num.indexOf("r") + 2;
		
		
		if(num.charAt(i) == '2') {
			
			System.out.println("Cool");
		}else {
			System.out.println("Not cool");
		}
		
		
		
		
	}

}

package videoPractice;

public class EmailTasc {
	
	public static void main(String[] args) {
		String newEmail = buildEmail("Aigul",".profile");
		System.out.println(newEmail);
		System.out.println(buildEmail("Kanat","Sultan"));
	}
	
	public static String buildEmail(String firstName, String lastName) {
		String email = firstName.toLowerCase()  + lastName.toLowerCase() +"@gmail.com";
		return email;
		//return email.toLowerCase();
	}

}

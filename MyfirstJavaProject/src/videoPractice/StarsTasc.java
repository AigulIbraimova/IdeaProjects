package videoPractice;

public class StarsTasc {
	
	public static void main(String[] args) {
		System.out.println(getStars(5));
		String myStars = getStars(2);
		System.out.println(myStars);
		
	}
	
	public static String getStars(int count) {
		String stars = "";
		for(int i=0; i<count; i++) {
			stars+="*";  //ad one more stars
		}
		return stars;
	}

}

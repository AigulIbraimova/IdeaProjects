package videoPractice;

public class WeekdaysTasc {
	
	public static void main(String[] args) {
		System.out.println(isValidDay("wednesday"));
		//boolean valid = isValidDay("funday");
		//System.out.println(valid);
	}
	
	public static boolean isValidDay(String day) {
		day = day.toLowerCase().trim();
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
				day.equals("thursday") || day.equals("friday") ||day.equals("saturday") ||
				day.equals("sunday")) {
			return true;
		}else {
			return false;
		}
	}

}

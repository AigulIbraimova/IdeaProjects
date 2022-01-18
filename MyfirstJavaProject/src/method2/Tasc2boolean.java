package method2;

public class Tasc2boolean {
	
	public static void main(String[] args) {
		boolean b =isWeatherSunny("Monday");
		                        //"Sunday"
		System.out.println(b);
		if(b) {
			System.out.println("Let's do picnic");
		}else {
			System.out.println("Let's do code");
		}
		
		
	}
	
	public static boolean isWeatherSunny(String day) {
		if(day.equals("Monday")) {
			return true;
		}
		System.out.println(day + " is not sunny");
		    return false;
	}

}

package videoPractice;

public class Array2 {
	public static void main (String [] args) {
		
		int [] time1 = new int[2]; //{10,15};
		int [] time2 = new int[2];
		
		time1[0] = 10;
		time1[1] =15;
		
		time2[0] = 16;
		time2[1] = 10;
		
		if(time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time has invalid hour");
			return;
		}
		if(time1[1] < 0 || time1[1] >59) {
			System.out.println("Time has invalid minute");
			return;
		}
		if(time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time has invalid hour");
			return;
		}
		if(time2[1] < 0 || time2[1] >59) {
			System.out.println("Time has invalid minute");
			return;
		}
		//compare Arrays and check which one is earlier
		//compare hours
		
		if(time1[0] < time2[0]) {
			System.out.println("Time one is earlier");
		}else if(time2[0] < time1[0]) {
			System.out.println("Time two is earlier");
		}else {
			System.out.println("Same time");
		}
		
	}

}

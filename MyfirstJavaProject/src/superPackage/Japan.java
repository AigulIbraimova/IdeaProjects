package superPackage;

public class Japan extends Country{
	
	public Japan() {
		super("Whatever");//this line is calling super class constructor
	}
	
	public void sakura() {
		System.out.println("Sakura method");
	}
	
	@Override
	public void anthem() {
		System.out.println("Some extra prints");
		super.anthem();
	}
	public static void main(String[] args) {
		
		Japan j = new Japan();
//		final int AGE;
//		System.out.println("some");
//		AGE = 23;
		
		
		
		
	
		
	}

}

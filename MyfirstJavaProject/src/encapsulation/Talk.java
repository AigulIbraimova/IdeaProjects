package encapsulation;

public class Talk {
	
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
//		iphone.model = "Galaxy";
//		iphone.memory = 128;
		
		iphone.setMemory(256);
		iphone.info();
		
		System.out.println(iphone.getMemory());
		
		
	}

}

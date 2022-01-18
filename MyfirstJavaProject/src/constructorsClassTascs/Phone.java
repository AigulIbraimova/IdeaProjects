package constructorsClassTascs;

public class Phone {
	
	boolean touchscreen;
	String model;
	int memory;
	String color;
	long phoneNumber;
	

	//String str1 = "Aigul";
	//SAtring str1 = new String("Aigul");
	
	
	//String cutString = st1.substring(0 , 2);
	
	
	
	/*public class Integer
	 * {
	 * 
	 * 
	 * public String(String name)
	 * {
	 * 
	 * 
	 * }
	 * 
	 * public void substring(int begin, int end)
	 * {
	 *     
	 * 
	 * }
	 * 

	 * }

	 * */
	
	//Phone phone1 = new Phone("Samsung" , "Black)
	
	public Phone(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	public Phone(String model, String color, int memory, boolean touchscreen) {
		this.model=model;
		this.color=color;   //this(model,color);
		this.touchscreen=touchscreen;
		if(memory>0) {
			this.memory=memory;
		}else {
			System.out.println("Invalid memory");
		}
	}
	
	public boolean text(long phoneNumber, String message) {
		String pn = phoneNumber + "";
		if(pn.length() == 10 && !message.isEmpty()) {
			System.out.println(message + " sent to " + phoneNumber);
			return true;
		}else {
			System.out.println("Invalid phone number or message");
			return false;
		}
		
		}
	
	public void call(long phoneNumber) {
		String pn = phoneNumber + "";
		if(pn.length() == 10) {
			System.out.println("Calling to " + phoneNumber);
		}else {
			System.out.println("Invalid phone number");
		}
	}

}

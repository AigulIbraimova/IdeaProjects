package abstractions;

public class Iphone extends Phone{
	
	@Override
	public void call() {
		System.out.println("Iphone is call calling in a cool way");
		
	}
	
	@Override
	public void internetConnection() {
		System.out.println("Iphone is connecting to internet");
		
	}

}

package abstractions;

public class Boeing extends Plane implements WiFi {

	@Override
	public void turnOnWiFi() {
		System.out.println("Turning on the wifi in Boing Plane");
	}

	@Override
	public void searchAvailableWiFi() {
		System.out.println("Searching for a network in Boeing Plane");
	}

	@Override
	public void takeOff(String destination) {
		System.out.println("Boeing is taking off and navigating" + destination);

	}

	@Override
	public void fly() {
		System.out.println("Boeing is flying");

	}

	@Override
	public void land() {
		System.out.println("Boeing is landing");
	}

}

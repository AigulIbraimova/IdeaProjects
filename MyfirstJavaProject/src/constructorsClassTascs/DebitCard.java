package constructorsClassTascs;

public class DebitCard {

	String cardNumber;
	String holderName;
	String type;
	int pin;
	double balance;

	public DebitCard(String cardNumber, String holderName, String type, int pin, double balance) {
		this.holderName = holderName;
		this.balance = balance;
		if (cardNumber.length() == 16) {
			this.cardNumber = cardNumber;
		} else {
			System.out.println("Invalid card number");
		}
		if (type.equalsIgnoreCase("mastercard") || type.equalsIgnoreCase("visa")) {
			this.type = type;
		} else {
			System.out.println("Invalid card type");
		}
		String pinStr = pin + "";
		if (pinStr.length() == 4) {
			this.pin = pin;
		} else {
			System.out.println("Invalid Pin");
		}
	}
}
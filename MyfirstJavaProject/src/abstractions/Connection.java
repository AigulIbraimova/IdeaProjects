package abstractions;

public class Connection {
	public static void main(String[] args) {
//		Phone p = new Phone();
//		p.call();
		Nokia n = new Nokia();
		n.call();
		Iphone i = new Iphone();
		i.call();
		i.info();
	}

}

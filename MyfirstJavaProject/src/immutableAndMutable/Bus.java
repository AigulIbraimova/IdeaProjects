package immutableAndMutable;

public class Bus {
	
	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("James");
		System.out.println(sb);
		sb.append("Bond");
		System.out.println(sb);
		sb.append(7);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.insert(2, "HELLO");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.replace(0, 4, "Whats up");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.delete(3, 45);
		System.out.println(sb);
	
		
		
	}

}

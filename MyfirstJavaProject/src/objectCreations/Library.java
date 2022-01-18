package objectCreations;

public class Library {
	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.title = "Zero to one";
		b1.author ="Blake Masters";
		b1.pages =150;
		
		Book b2 = new Book();
		
		b2.title ="10 x";
		b2.author ="Grand Cardone";
		b2.pages =200;
		
		Book b3 = new Book();
		
		b3.title ="Crime and punishment";
		b3.author ="Dostoevski";
		b3.pages =300;
		
		Book [] myBook = new Book[3];
		myBook[0] = b1;
		myBook[1] = b2;
		myBook[2] = b3;
		
		for(Book b:myBook) {
			System.out.println(b.author);
			
		}
		
	}

}

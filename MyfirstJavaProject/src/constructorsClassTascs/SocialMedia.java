package constructorsClassTascs;

public class SocialMedia {
	
	public static void main(String[] args) {
		
		FacebookUser myfb1 = new FacebookUser("luna7","luna2019" );
		myfb1.name="Luna Bond";
		FacebookUser myfb2 = new FacebookUser("aigul","Sunshine");
		myfb2.age =31;
		myfb2.name="Aigul";
		myfb2.numberOfFriends = 4999;
		
		System.out.println(myfb2.userName);
		System.out.println(myfb2.password);
		System.out.println(myfb1.age);
		
		FacebookUser myfb3 = new FacebookUser("John Wick", "jwick", "jwick2019");
		System.out.println(myfb3.name);
		System.out.println(myfb3.password);
		
		boolean check= myfb1.sendFriendRequest(myfb2);
		System.out.println(check);
		myfb1.sendFriendRequest(myfb2);
		System.out.println(myfb1.numberOfFriends);
		System.out.println(myfb2.numberOfFriends);
		
		myfb1.userinfo();
		myfb2.userinfo();
		
		
	}

}

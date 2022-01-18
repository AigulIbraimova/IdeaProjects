package constructorsClassTascs;

public class FacebookUser {
	
	String userName;
	int age;
	String name;
	String password;
	int numberOfFriends;
	
	
	public FacebookUser(String name, String userName, String password) {
		this.name=name;
		this.userName=userName;
		if(password.contains(userName)) {
			System.out.println("Password CANNOT contain username. please change the password.");
		}else {
			this.password =password;
		}
	}
	
	public FacebookUser(String userName, String password) {
		this.userName = userName;
		this.password = password;
		
	}
	
	public boolean sendFriendRequest(FacebookUser user) {
		if(user.numberOfFriends < 5000) {
			System.out.println("Friend request sent to " + user.name);
			user.numberOfFriends ++;
			this.numberOfFriends ++;
			return true;
		}else {
			System.out.println(user.name + " can,t accept frienf request!");
			return false;
		}
	}
	
	public void userinfo() {
		System.out.println("\nFACEBOOK USER INFORMATION");
		System.out.println("Name: "+this.name);
		System.out.println("Username: "+this.userName);
		System.out.println("Age: "+this.age);
		System.out.println("Friends: "+this.numberOfFriends);
		
		
	}
	
	

}

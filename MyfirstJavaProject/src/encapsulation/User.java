package encapsulation;

public class User {
	
	private String friends;
	private int listOfPosts;
	private String name;
	private int age;
	private String location;
	
	public String getFriends() {
		return friends;
	}
	public void setFriends(String friends) {
		this.friends = friends;
	}
	public int getListOfPosts() {
		return listOfPosts;
	}
	public void setListOfPosts(int listOfPosts) {
		this.listOfPosts = listOfPosts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}

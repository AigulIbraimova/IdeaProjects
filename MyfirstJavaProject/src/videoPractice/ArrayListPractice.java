package videoPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		//Creating an ArrayList object
		ArrayList<String> lst = new ArrayList();
		//List<String> lst1 = new ArrayList();
		//adding elements
		lst.add("apple"); lst.add("Orange"); lst.add("Banana");
		System.out.println(lst);
		//getting elements
		System.out.println("first element " + lst.get(0));
		System.out.println("second element " + lst.get(1));
		//check if items exists in the list
		System.out.println(lst.contains("apple"));
		System.out.println(lst.contains("Apple"));
		System.out.println(lst.contains("pear"));
		//getting the index of item by value idexOf(item);
		System.out.println("index of Orange " + lst.indexOf("Orange"));
		//checking how many item in the list
		System.out.println("item count " + lst.size());
		//checking if the list empty
		System.out.println("list is empty? " + lst.isEmpty());
		//setting the value for certain index
		lst.set(2, "Cherry");
		System.out.println("new list item " + lst);
		//removing item by index
		lst.remove(1);
		System.out.println("new list item after deleting " + lst);
		//removing item by value
		lst.remove("apple");
		System.out.println("new list item after deleting " + lst);
		//removing all the item in the list
		lst.clear();
		System.out.println("new list item after clearing " +lst);
		//checking if the list empty or not
		System.out.println("list is empty " + lst.isEmpty());
		
		
		
		
	}

}

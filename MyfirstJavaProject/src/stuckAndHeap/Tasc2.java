package stuckAndHeap;

import java.util.ArrayList;

public class Tasc2 {
	
	public static void main(String[] args) {
		
		ArrayList<String>w = new ArrayList<>();
		w.add("car");
		w.add("so");
		w.add("it");
		System.out.println(w);
		insertHello(w);
	}
	
	public static void insertHello(ArrayList<String>words) {
		for(int i=0; i<words.size(); i++) {
		if(words.get(i).length() ==2) {
			StringBuilder sb = new StringBuilder(words.get(i));
			sb.insert(1, "hello");
			words.set(i, sb.toString());
		}
		}
		System.out.println(words);
	}

}

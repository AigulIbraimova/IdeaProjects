package method2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Practice {
	
	public static void main(String[] args) {
		String info = "Aigul,Ibraimova,Aigulprofile@gmail.com";
		String name = getName(info);
		String email = getEmail(info);
		
	}
	
	public static String getName(String str) {
		String arr [] =str.split(",");
		return arr[0] +" " + arr[1];
		
		
	}
	public static String getEmail(String str) {
		String arr [] =str.split(",");
		return arr[2];
		
	}

}

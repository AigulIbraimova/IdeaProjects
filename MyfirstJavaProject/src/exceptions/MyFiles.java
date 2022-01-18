package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFiles {

    public static void main(String[] args) {

        File file = new File("hi");
        System.out.println(file.exists());
        try{
            Scanner input = new Scanner(file);
            System.out.println(input.nextLine());
            System.out.println(input.nextLine());
        }
        catch (FileNotFoundException e){
            System.out.println("File was not found in Scanner");
        }
        System.out.println("End of program");

    }
}

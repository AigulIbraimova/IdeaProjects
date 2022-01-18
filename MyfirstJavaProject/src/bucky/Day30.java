package bucky;

import java.util.Scanner;

public class Day30 {

    public static void main(String[] args) {
     introduce();

    }

    public static void introduce(){

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name);
    }
}



package avengers;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        countWords("Today is a great day");

    }

    public static void countWords(String words){
        String [] sentence = words.trim().split(" ");
        System.out.println(Arrays.toString(sentence));
        System.out.println(sentence.length);

    }
}

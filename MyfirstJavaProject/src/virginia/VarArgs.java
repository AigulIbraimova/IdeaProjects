package virginia;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        printWords("red", "blue", "yellow");
        printWords("black");

        cook("Burrito Bowl","Rice", "Beans", "Meat", "Sour Cream", "Cheese", "Salsa");



    }

    public static void printWords(String...words) {
        //handle it like an array
        for (String w : words) {
            System.out.println(w);
        }
    }
        public static void cook(String name, String...ings){
            System.out.print("Food: " + name);
            System.out.println(Arrays.toString(ings));
        }


}

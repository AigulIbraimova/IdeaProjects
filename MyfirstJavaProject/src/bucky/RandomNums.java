package bucky;

import java.util.Random;

public class RandomNums {

    public static void main(String[] args) {
        showMe5Numbers();

    }

    public static void showMe5Numbers(){
        Random rand = new Random();
        for(int i=0; i<5; i++){
            System.out.println(rand.nextInt(500));
        }
    }
}

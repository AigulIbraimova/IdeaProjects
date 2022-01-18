package virginia;

import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {
        countUp(5);
        countUp(10);
        countUp(0);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to cout");
        int number = input.nextInt();
        countUp(number);

    }

    public static void countUp(int num) {
        if (num < 1) {
            System.out.println("Invalid");
        } else{
            for (int i = num; i>=1;  i--){
                System.out.print(i+ " ");
            }
        System.out.println();
    }
    }
}

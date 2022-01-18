package virginia;

import java.util.Arrays;

public class TwoArrays {

    public static void main(String[] args) {

        int [] one = {1,2,3,4,7,1};
        int [] two = {5,6,7,8,7};
        print2Arrays(one, two);


    }

    public static void print2Arrays(int [] num1, int [] num2){
        if(num1.length > num2.length){
            System.out.println(Arrays.toString(num1));
            System.out.println(Arrays.toString(num2));
        }else{
            System.out.println(Arrays.toString(num2));
            System.out.println(Arrays.toString(num1));

        }
    }
}
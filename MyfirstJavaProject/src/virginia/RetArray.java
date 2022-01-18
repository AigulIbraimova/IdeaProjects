package virginia;

import java.util.Arrays;
import java.util.Random;

public class RetArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray()));

        int [] nums = getArray();
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(getRandomArray(10)));

    }

    public static int [] getArray(){
        int [] retArray = {23,56,43,89};
        return retArray;
    }

    public static int[] getRandomArray(int size){
        Random rand = new Random();
        int [] nums = new int [size];
        for(int i=0; i<size; i++){
            nums[i] = rand.nextInt(100);
        }
        return nums;
    }
}

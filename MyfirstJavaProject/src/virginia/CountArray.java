package virginia;

public class CountArray {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,5,5,5,6,6,6,7,8,9};
        System.out.println(findOccurences(nums, 5));
        System.out.println(findOccurences(nums, 6));

        int five = findOccurences(nums, 3);
        System.out.println(five);


    }
    public static int findOccurences(int [] array, int value){
        int counter = 0;
        for(int num:array){
            if(num==value){
                counter++;

            }
        }
        return counter;

    }


}

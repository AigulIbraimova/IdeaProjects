package virginia;

public class ArrayMethod {

    public static void main(String[] args) {
       int myArray [] = {12,34,56,78,90};
       printArray(myArray);             //nums=myArray



    }

    public static void printArray(int [] nums){
        for(int n:nums){
            System.out.print(n+ " ");
        }
        System.out.println();
    }
}

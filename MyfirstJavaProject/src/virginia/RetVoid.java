package virginia;

public class RetVoid {

    public static void main(String[] args) {
         addVoid(1,2);

        int result = add(3,6);
        System.out.println("Result is : " + result);
        System.out.println(add(3,9));

    }



    public static void addVoid(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("sum is: "+ sum);
    }

    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;

    }


}

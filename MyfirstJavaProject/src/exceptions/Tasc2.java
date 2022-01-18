package exceptions;

public class Tasc2 {

    public static void main(String[] args) {
        int [] nums = {34,2,5};
        System.out.println("Hello");
        try{
            System.out.println("nums[1]");
            String s = "hi";
            System.out.println(s.charAt(0));

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("handled");
        }
        finally {
            System.out.println("Bye");
        }

    }
}

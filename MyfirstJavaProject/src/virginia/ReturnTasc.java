package virginia;

public class ReturnTasc {

    public static void main(String[] args) {
        System.out.println(print10$());
        int i = print10$();
        System.out.println("i: " +i);

        System.out.println(giveMeYourName());
        String myName = giveMeYourName();
        System.out.println("My name is: " + myName);
    }

    public static int print10$(){
        System.out.println("returning 10 from method");
        return 10;
    }

    public static String giveMeYourName(){
        String name = "Luna";
        return name;
    }
}

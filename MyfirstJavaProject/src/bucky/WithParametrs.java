package bucky;

public class WithParametrs {

    public static void main(String[] args) {
        study("Java");
        study("HTML");
        sleep(10);
    }
    public static void study(String topic){
        System.out.println("Student is studying " + topic);

    }

    public static void sleep(int hour){
        System.out.println("Student has been sleeping for " + hour + " hours");

    }
}

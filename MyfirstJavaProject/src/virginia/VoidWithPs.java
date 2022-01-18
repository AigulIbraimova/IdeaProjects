package virginia;

public class VoidWithPs {

    public static void main(String[] args) {
        drive("Audi", 80);
        login("luna","Luna");
    }

    public static void drive(String car, int speed){
        System.out.println(car + " is driving " + speed + " mph");

    }

    public static void login(String userName, String password){
        if(userName.equalsIgnoreCase(password) && password.equalsIgnoreCase(userName)){
            System.out.println("Wellcome");
        }else{
            System.out.println("Sign in failed");
        }
    }
}

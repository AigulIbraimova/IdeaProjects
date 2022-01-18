package virginia;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("Choose operator: '+', '-', '*', '/' ");
        String operator = input.next();
        switch(operator){
            case "+":
                add(number1, number2);
                break;
            case "-":
                subtract(number1, number2);
                break;
            case "*" :
                multiply(number1, number2);
                break;
            case "/" :
                divide(number1, number2);
                break;
            default:
                System.out.println("Invalid operator");
                //break;

        }
    }

    public static void add(double num1, double num2){
        double result = num1+num2;
        System.out.println("Result: " + result);
    }

    public static void subtract(double num1, double num2){
        double result = num1-num2;
        System.out.println("Result: " +result);
    }

    public static void multiply(double num1, double num2){
        double result = num1*num2;
        System.out.println("Result: " +result);
    }

    public static void divide(double num1, double num2){
        if(num2==0) {
            System.out.println("Can not / by zero");
            return;
        }
            double result = num1 / num2;
        System.out.println("Result: " +result);


    }
}

package virginia;

public class ReturnMethod {

    public static void main(String[] args) {
        double mResult = multiply(5,6);
        System.out.println("MultiplyResult: " + mResult);

        double [] dnums = {7.0, 8,5};
        double result2 = multiply(dnums[0], dnums[1]);
        System.out.println("Results2: " + result2);


    }

    public static double multiply(double num1, double num2){
        double result = num1*num2;
        return result;
    }
    public static double minus(double num1, double num2){
        double result = num1-num2;
        return result;
    }
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("ERROR:Can not devide by zero");
            return 0;
        } else {
            double result = num1 / num2;
            return result;
        }

    }
}

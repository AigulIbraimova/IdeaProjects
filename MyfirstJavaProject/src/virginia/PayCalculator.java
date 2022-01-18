package virginia;

public class PayCalculator {

    public static void main(String[] args) {
        int pay = getHourlyPay(40, 20);
        System.out.println("Total pay for 40 hours: " + pay);

    }

    public static int getHourlyPay(int hour, int rate){
        int totalPay = hour * rate;
        return totalPay;

    }
}

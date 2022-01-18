package bucky;

public class FiveStars {

    public static void main (String [] args){
        print5Stars();
        for(int i=1; i<10; i++){
            print5Stars();
        }

    }

    public static void print5Stars(){
        System.out.println("* * * * *");
    }
}

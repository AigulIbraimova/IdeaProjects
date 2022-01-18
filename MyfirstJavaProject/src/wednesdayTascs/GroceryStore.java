package wednesdayTascs;

public class GroceryStore {


    public static void main(String[] args) {

        Apple apple1 = new Apple(5, "big", "red", "sweet");
        Apple apple2 = new Apple(34, "medium", "yellow", "normal");
        Apple apple3 = new Apple(1, "small", "green", "like lemon");

        Apple[] appleArr = {apple1, apple2, apple3};

        System.out.println("Your apple specs are: ");

        for (int i = 0; i < appleArr.length; i++) {

            System.out.println("------------------------");
            System.out.println("Apple #" + (i + 1));
            System.out.println("Weight\t :" + appleArr[i].weight);
            System.out.println("Size\t :" + appleArr[i].size);
            System.out.println("Color\t :" + appleArr[i].color);
            System.out.println("Taste\t :" + appleArr[i].taste);


        }


    }


}

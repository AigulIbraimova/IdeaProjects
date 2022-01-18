package virginia;

public class Recipe {

    public static void main(String[] args) {
      makePancakes();
      cook("Spagetti", "noodle");
      cook("Omelette", "salt, eggs, tomatoes, green paper");

    }

    public static void cook(String dish, String ingr){
        System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
        add(ingr);
        mix(7);
        fry(6);
        broil(8);
        System.out.println("Cook it until it is cooked");
        System.out.println("~~" + dish.toUpperCase()+" is ready");


    }

    public static void makePancakes(){
        System.out.println("~~Pancakes recipe~~");
        add("flour, sugar, egg, milk, oil");
        mix(20);
        fry(4);
        System.out.println("Engoy:)");

    }

    public static void add(String ingr){
        System.out.println("Add " + ingr);
    }

    public static void mix(int second){
        System.out.println("Mixing " + second + " seconds");
    }

    public static void fry(int minute){
        System.out.println("Frying " + minute +" minutes");
    }

    public static void broil(int minute){
        System.out.println("Broil " +minute + " minutes");
    }
}

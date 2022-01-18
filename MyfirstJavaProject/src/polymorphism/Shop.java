package polymorphism;

import java.util.ArrayList;

public class Shop {

    public static void main(String[] args) {

//        Flower f = new Flower ("Rose");
//        f.color = "Red";
//        f.grow();
//        //Reference type of <f> is Flower.
//        //Object type of <f> is Flower.
//
//        Huskey huskey = new Huskey();
//        huskey.bite();
//        huskey.eat();
//        huskey.makeNoise();

//        Trainable huskey = new Huskey();
//        huskey.bring("Remote controller");
//        huskey.sit();
//        ((Dog)huskey).bite();
//       // huskey.bite();

        ArrayList<Animal> animals = new ArrayList<>();
        Animal a1 = new Dog();
        Cat c = new Cat();
        Huskey h = new Huskey();
        animals.add(a1);
        animals.add(c);
        animals.add(h);
        for (Animal a: animals){
            a.makeNoise();


        }



    }
}

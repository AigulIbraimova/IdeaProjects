package PolymorphismTasc;

public class Aeron extends Chair implements Rollable {

    @Override
    public void sit() {
        System.out.println("Sitting on the Aeron chair");

    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on the Aeron chair");

    }

    @Override
    public void rollBack() {
        System.out.println("Aeron chair is rolling back");
    }

    @Override
    public void rollForward() {
        System.out.println("Aeron chair is rolling forward");

    }
}

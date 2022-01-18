package interfaces;

public class ConInter implements Inter1 {


    @Override
    public void m1() {
        System.out.println("Hi");
    }

    @Override
    public void m2() {
        System.out.println("Bye");
    }

    @Override
    public void m3() {
        System.out.println("Ok");
    }

    public static void main (String[] args){
        ConInter conInter = new ConInter();
        conInter.m1();
        conInter.m2();
        conInter.m3();

    }
}

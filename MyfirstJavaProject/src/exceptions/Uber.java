package exceptions;

public class Uber {

    public static void main(String[] args) throws Exception {

        Driver driver1 = new Driver();
        try {
            driver1.setName("James bond");
            driver1.setAge(-9);
            driver1.setLocation("KG");
        }
        catch(InvalidAgeException e){
            System.out.println("Catch for Age");
        }

        catch(Exception e){
            System.out.println("Catch for general");
        }
//        try{
//            driver1.setLocation("KG");
//        }
//        catch(InvalidLocationException e){
//            System.out.println("Catch from location");
//        }
        //driver.getName();
        driver1.info();

//        Exception ex = new Exception();
//        StringIndexOutOfBoundsException s = new StringIndexOutOfBoundsException();

    }
}

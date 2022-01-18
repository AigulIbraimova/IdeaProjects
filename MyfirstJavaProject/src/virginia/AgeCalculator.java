package virginia;

public class AgeCalculator {

    public static void main(String[] args) {
        int age=calculateAge(1987);
        System.out.println("You are " + age +" years old");

        int age2 = calculateAge(1994);
        System.out.println("You are " + age2 +" years old");

        System.out.println(calculateAge(2025));
    }

    public static int calculateAge(int year){
        int currentYear=2019;
        int age = currentYear - year;
        if(age<0){
            System.out.println("Invalid age");
            return 0;
        }else if(age<=14){
            System.out.println("Child");
        }else if(age>=15 && age<=25){
            System.out.println("Young");
        }else if(age>=26 && age<=65){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
        return age;

    }
}

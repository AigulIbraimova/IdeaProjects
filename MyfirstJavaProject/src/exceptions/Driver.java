package exceptions;

public class Driver {

        private String name;
        private int age;
        private String location;

        public void info(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Location: " + location);
        }

    public String getName() throws InvalidLocationException{

        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {

        return location;
    }

    public void setName(String name) throws Exception {
            if(name.trim().contains(" ")){
                throw new Exception("Multiple words are not allowed");
            }
        this.name = name;
    }

    public void setAge(int age) {
            if(age < 0 || age > 120){
                throw new InvalidAgeException();
            }
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

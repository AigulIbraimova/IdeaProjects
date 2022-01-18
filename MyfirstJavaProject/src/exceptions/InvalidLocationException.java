package exceptions;

public class InvalidLocationException extends Exception {

    public InvalidLocationException(){

    }
    public InvalidLocationException(String location) throws InvalidLocationException{
        if(location.length()<3){
            throw new InvalidLocationException();
        }
           // this.location = location;
    }


}

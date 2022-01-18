package avengers;

public class CodingBat {

    public static void main(String[] args) {

      CodingBat code = new CodingBat();
       String str= code.theEnd("hello",true);
        System.out.println(str);




    }

    public  static String theEnd(String str, boolean front){
       if(front){
           return str.charAt(0)+"";
       } else {
           return str.charAt(str.length()-1)+ "";
       }
    }


}

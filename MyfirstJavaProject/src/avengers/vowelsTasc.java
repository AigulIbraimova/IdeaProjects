package avengers;

public class vowelsTasc {

    public static void main(String[] args) {
        vowelsAndConsonants("apple");


    }

    public static void vowelsAndConsonants(String str) {
        int vowels = 0;
        int consonant = 0;
        String allVowels = "a e i o u ";

        for (int i = 0; i < str.length(); i++) {
            if (allVowels.contains(str.charAt(i) + "")) {
                vowels++;
            } else {
                consonant++;
            }
        }
        System.out.println("vowels " + vowels);
        System.out.println("consonant " +consonant);

    }
}

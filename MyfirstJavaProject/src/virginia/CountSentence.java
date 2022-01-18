package virginia;

import java.util.Arrays;

public class CountSentence {

    public static void main(String[] args) {
        countWords("Java is fun");
     String result = "About 121,000,000 results (0.75 seconds)";
        googleSearchResults(result);

    }
    public static void countWords(String words) {
        String[] sentenceArr = words.trim().split(" ");
        System.out.println(Arrays.toString(sentenceArr));
        System.out.println(sentenceArr.length);
    }

    public static void googleSearchResults(String sentence){
        String [] senArr = sentence.trim().split(" ");
        String count = senArr[1].replace(",", "");
      String seconds = senArr[3].replace("(", "");
        System.out.println(count);
        System.out.println(seconds);

    }



}

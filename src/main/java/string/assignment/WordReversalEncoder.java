package string.assignment;
import java.util.*;

public class WordReversalEncoder {

    static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder reverse = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse.append(word.charAt(i));
            }

            result.append(reverse).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = reverseEachWord(sentence);

        System.out.println("Reversed sentence: " + result);

        sc.close();
    }
}
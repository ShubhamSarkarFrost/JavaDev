import java.io.IOException;
import java.util.Scanner;

public class reverseOddLengthWords {

    public static void main(String[]Args) throws IOException {

        String sen;
        System.out.println("Enter the Sentence");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();

        String[] words = sen.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() % 2 != 0) {
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                result.append(reversedWord.toString()).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        // Remove the trailing space
        System.out.println(result.toString().trim());
    }
}

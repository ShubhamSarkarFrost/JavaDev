package practiceprograms;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SentencetoLowercase {

    public static void main(String[]Args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String sen = scanner.nextLine();

        StringBuilder sb = new StringBuilder(sen);
        String[] words = sb.toString().split(" ");

        for(int i =0 ; i< words.length; i++){
            words[i] = words[i].toLowerCase();
        }

        StringBuilder result = new StringBuilder();
        for(String word : words){
            result.append(word).append(" ");
        }

        String finalString = result.toString().trim();

        System.out.println("Lowercase string: " + finalString);

        scanner.close();

    }
}

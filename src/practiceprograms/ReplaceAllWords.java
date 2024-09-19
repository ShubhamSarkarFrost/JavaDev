package practiceprograms;

import java.io.IOException;
import java.util.Scanner;

public class ReplaceAllWords {

    public static void main(String[]Args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Sentence from which words has to be replaced");
        String sen = sc.nextLine();
        System.out.println("Please Enter the word that has to be replaced");
        String word = sc.nextLine();

        String updatedText = sen.replaceAll("\\b"+word+"\\b", "").trim().replaceAll(" +", " ");
        System.out.println("The Updated Sentence is :"+ updatedText);
    }
}

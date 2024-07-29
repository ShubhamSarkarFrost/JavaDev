import java.io.IOException;
import java.util.Scanner;

public class IdenticalCharcters {

    public static void identicalCharcaters(String sen){

        String[] words = sen.split("\\s");

        for(String word: words){
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) == word.charAt(i + 1)) {
                    System.out.println("Characters are identical : "+ word.charAt(i));
                }
            }

        }
        System.out.println("No Characters are identical");


    }

    public static void main(String[]Args) throws IOException {
        String sen;
        System.out.println("Enter the Sentence");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();
        identicalCharcaters(sen);
    }
}

import java.io.IOException;
import java.util.Scanner;

public class evenLengthWords {

    public static void main(String[]Args) throws IOException {

        String sen;
        System.out.println("Enter the Sentence in which you want to find even characters ");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();

        String[] words = sen.split(" ");

        for(String word : words){
            if(word.length() % 2 == 0){
                System.out.println(word);
            }
        }
    }
}

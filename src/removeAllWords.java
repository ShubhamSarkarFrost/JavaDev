import java.io.IOException;
import java.util.Scanner;

public class removeAllWords {

    public static String removeWords(String text, String wordToRemove){
        if(text == null || wordToRemove == null || wordToRemove.isEmpty()){
            return text;
        }

        String regex = "\\b"+wordToRemove+"\\b";
        return  text.replaceAll(regex, "").replaceAll("\\s", " ").trim();
    }

    public static void main(String[]Args) throws IOException {

        String sen, newsen;
        System.out.println("Enter the First Word");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();

        System.out.println("Enter the Replace Word");
        newsen = sc.nextLine();

        System.out.println("Updated sentence is \n");
        System.out.println(removeWords(sen,newsen));

    }
}

import java.io.IOException;
import java.util.Scanner;

public class returnEvenNewCharcters {

    public static String evencharcterssen(String sen){

        int len = sen.length(); // Get the length of the given string
        String fin_str = ""; // Initialize an empty string to store the result

        // Loop through the string, incrementing by 2 to get even-indexed characters
        for (int i = 0; i < len; i = i + 2) {
            fin_str += sen.charAt(i); // Concatenate even-indexed characters to the result string
        }

        return fin_str; // Return the final string containing even-indexed characters
    }

    public static void main(String[]Args) throws IOException {
        String sen;
        System.out.println("Enter the Sentence");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();
        System.out.println("New Sentence is :"+ evencharcterssen(sen));
    }
}

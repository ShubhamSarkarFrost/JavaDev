import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SortaString {

    public static void main(String[]Args) throws IOException {

        String sen;
        System.out.println("Please Enter the string of characters you want to sort");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();

        char[] charArray = sen.toCharArray();

        Arrays.sort(charArray);

        System.out.println(new String(charArray));


    }
}

import java.io.IOException;
import java.util.Scanner;

public class Unicode_conversion {

    public static void convertunicode(char unicode) {
         System.out.println("The Value of the Unicode character is :-"+unicode);
    }

    public static void main(String[]args) throws IOException{
        char unicode;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Unicode Character ");
        unicode = sc.next().charAt(0);
        convertunicode(unicode);
    }
}

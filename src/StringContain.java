import java.io.IOException;
import java.util.Scanner;

public class StringContain {

    public static boolean areLettersPresent(String firstString, String secondString) {

        int[] charcount = new int[256];

        //count the occurance of each character
        for (char c : firstString.toCharArray()) {
            charcount[c]++;
        }

        //check if all characters of second string are present in first string
        for (char c : secondString.toCharArray()) {
            if (charcount[c] == 0) {
                return false;
            }
            charcount[c]--;
        }
        return true;
    }

    public static boolean testAllCharactersPresent(String firstString, String secondString) {

        if (secondString.length() > firstString.length()) {
            return false;
        }
        if (secondString.isEmpty()) {
            return false;
        }

        for (int i = 0; i < secondString.length(); i++) {
            if (!firstString.contains(String.valueOf(secondString.charAt(i)))) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[]Args) throws IOException {

        String sen, newsen;
        System.out.println("Enter the First Word");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();

        System.out.println("Enter the Second Word");
        newsen = sc.nextLine();

        if (areLettersPresent(sen, newsen)) {
            System.out.println("All letters of the second string are present in the first string.");
        } else {
            System.out.println("Not all letters of the second string are present in the first string.");
        }

        if (testAllCharactersPresent(sen, newsen)) {
            System.out.println("All letters of the second string are present in the first string.");
        } else {
            System.out.println("Not all letters of the second string are present in the first string.");
        }



    }
}

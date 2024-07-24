import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

public class AnagramStrings {

    public static void main(String[]Args) throws IOException {
        String checksen,matchsen, str1, str2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First String to Check Anagram of");
        checksen = br.readLine();
        System.out.println("Enter the Second String to Check Anagram of");
        matchsen = br.readLine();

        str1 = checksen.replace("\\s", " ").toLowerCase();
        str2 = matchsen.replace("\\s", " ").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("Not an Anagram");
        }else{
            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            if(Arrays.equals(array1,array2)){
                System.out.println(checksen +" is an anagram of "+matchsen);
            }else {
                System.out.println("Not an Anagram");
            }
        }

    }
}

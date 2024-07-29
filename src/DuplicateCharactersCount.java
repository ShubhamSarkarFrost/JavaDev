import java.io.IOException;
import java.util.Scanner;

public class DuplicateCharactersCount {

    public static void countduplicates(String sen){
        int[] charcount = new int[256];
        int result = 0;

        //count frequency of all characters
        for(char c : sen.toCharArray()){
            charcount[c]++;
        }

        for(int i = 1; i<charcount.length; i++){
            if(charcount[i] > 1){
               result = charcount[i];
            }
        }
        System.out.println("Number of Repeated Characters are: "+result);
    }

    public static void duplicatescount(String sen){
        int ctr = 0;

        while (sen.length()> 0){
            // Check if the count of a character (after removal) is more than 2 in the string
            if(sen.length() - sen.replaceAll(sen.charAt(0)+"", "").length() > 2){
                ctr++;

            }
            // Remove all occurrences of the first character from the string 'text'
            sen = sen.replaceAll(sen.charAt(0) + "", "");
        }
        System.out.println("Number of Repeated Characters are : "+ctr);

    }

    public static void main(String[]Args) throws IOException {


        String sen;
        System.out.println("Enter the Sentence");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();

       countduplicates(sen);
       duplicatescount(sen);


    }
}

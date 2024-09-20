package IBMPracticeQuestions;

import java.util.Scanner;

public class FirstNotRepeatingCharacter {

    public static char firstNonRepeatingCharacter(String sen){
        int[] charCount = new int[128];

        for(int i = 0; i<sen.length(); i++){
            charCount[sen.charAt(i)] ++;
        }

        for(int i = 0 ; i< sen.length(); i++){
            if(charCount[sen.charAt(i)] == 1){
                return sen.charAt(i);
            }
        }
        return '-';
    }

    public static void main(String[]Args){
        String sen;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter a Valid Sentence");
            sen = sc.nextLine();
            char result = firstNonRepeatingCharacter(sen);
            if (result != '-') {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("No non-repeating character found.");
            }

        }catch (Exception e){
            System.out.println("The Entered Sen is not a Valid Sentence");
        }
    }
}

package practiceprograms;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Reverse the sentence
        String reversedSentence = reverseString(sentence);

        // Output: Display the reversed sentence
        System.out.println("Reversed sentence: " + reversedSentence);

        // Reverse the sentence
        String RevSen = StringReverse(sentence);

        // Output: Display the reversed sentence
        System.out.println("Reversed sentence: " + RevSen);

        scanner.close();
    }

    private static String StringReverse(String sentence) {

        StringBuilder sb = new StringBuilder(sentence);
        return sb.reverse().toString();
    }

    private static String reverseString(String sentence) {
        char[] charArray = sentence.toCharArray();
        int left = 0;
        int right = sentence.length() -1;

        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;

        }
        return new String(charArray);
    }
}

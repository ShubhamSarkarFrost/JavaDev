import java.io.IOException;
import java.util.Scanner;

public class reverseOddLengthWordsOld {

    public static String reverseOddLengthWords(String sen) {

        if (sen == null || sen.isEmpty()) {
            return sen;
        }
        String[] words = sen.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 != 0) {
                words[i] = reverseWords(words[i]);
            }
        }
        return String.join(" ", words);

    }

    private static String reverseWords(String word) {

        char[] charArray = word.toCharArray();
        int left, right;
        left = 0;
        right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static void main(String[] Args) throws IOException {


        String sen;
        System.out.println("Enter the Sentence");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();

        System.out.println("the Reverse odd characters new sentence is :" + reverseOddLengthWords(sen));
    }
}

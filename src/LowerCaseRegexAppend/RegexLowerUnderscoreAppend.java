package LowerCaseRegexAppend;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLowerUnderscoreAppend {

    public static void main(String[]Args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the sentence on which lowercase words followed by underscore has to be extracted");
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile("[a-z]+(?:_[a-z]+)*");
        Matcher matcher = pattern.matcher(input);

        // declare string Builder
        StringBuilder sb = new StringBuilder();

        while (matcher.find()){
            String matchedSequence = matcher.group();
            // Remove underscores and append words
            sb.append(matchedSequence.replace("_", ""));
        }
        // Output the concatenated result
        System.out.println("Concatenated words: " + sb.toString());
    }
}

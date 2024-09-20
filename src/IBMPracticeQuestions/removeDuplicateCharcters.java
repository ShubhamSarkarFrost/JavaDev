package IBMPracticeQuestions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicateCharcters {

    public static String removeDuplicates(String sen){
        boolean [] seen = new boolean[128]; // considering all the ascii characters
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i<sen.length(); i++){
            char currentChar = sen.charAt(i);

            if(!seen[currentChar]){
                result.append(currentChar);
                seen[currentChar] = true;
            }


        }
        return result.toString();
    }

    public static String noDuplicates(String sen){
        Set<Character> charSet = new LinkedHashSet<>();

        for(int i = 0 ; i<sen.length(); i++){
            charSet.add(sen.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for(char curChar : charSet){
            result.append(curChar);
        }

        return  result.toString();

    }

    public static void main(String[]Args){
        String sen, noDuplicatewithoutList,noDuplicatewithList;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter a Valid Sentence");
            sen = sc.nextLine();
            noDuplicatewithoutList = removeDuplicates(sen);
            System.out.println("The Remove Duplicate Logic Without Set is :"+ noDuplicatewithoutList);
            noDuplicatewithList = noDuplicates(sen);
            System.out.println("The Remove Duplicate Logic With Set is :"+ noDuplicatewithList);

        }catch (Exception e){
            System.out.println("The Entered Sen is not a Valid Sentence");
        }
    }
}

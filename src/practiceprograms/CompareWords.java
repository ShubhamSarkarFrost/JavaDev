package practiceprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareWords {

    public  static void compareTwoWords(String wordOne, String wordTwo){
        int matchValue;
        matchValue = wordOne.compareToIgnoreCase(wordTwo);
        if(matchValue > 0){
            System.out.println(wordOne + " is greater than" + wordTwo);
        } else if (matchValue == 0) {
            System.out.println(wordOne + " is equal to " + wordTwo);
        }else{
            System.out.println(wordOne + " is less than "+ wordTwo);
        }
    }

    public static void main(String[]Args) throws IOException {
        String valueOne, ValueTwo;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Word");
        valueOne = br.readLine();
        System.out.println("Enter Second Word");
        ValueTwo = br.readLine();

        compareTwoWords(valueOne, ValueTwo);
    }
}

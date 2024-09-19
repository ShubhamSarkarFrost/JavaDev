package practiceprograms;

import java.io.IOException;
import java.util.Scanner;

public class AlphanumericCharacterCountWithoutMap {

    public static void main(String[]Args)throws IOException {

        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();

        int[] letterCount = new int[26];
        int[] numberCount = new int[10];

        for(char c: sen.toCharArray()){
            if(Character.isAlphabetic(c)){
                letterCount[Character.toLowerCase(c) - 'a']++;
            } else if (Character.isDigit(c)) {
                numberCount[c - '0']++;
            }
        }

        int count =0;
        for(int freq : letterCount){
            if(freq > 2){
                count++;
            }
        }

        for(int freq: numberCount){
            if(freq > 2){
                count++;
            }
        }

        System.out.println("Number of alphanumeric characters occurring more than twice: " + count);
    }
}

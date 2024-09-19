package BasicPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseName {

    public static void main(String[] Args) throws IOException {
        String name;
        String reverseName1 = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter a Name");
        name = br.readLine();


        //reverse your name with for
//        for (int i = name.length() - 1; i >= 0; i--) {
//            System.out.print(name.charAt(i)); // Print characters in reverse order
//        }
        //Payal Sarkar  - IP
        //Sarkar Payal  - OP

        int spaceChar =0;
        int lastLength = name.length();
        for(int i = 0 ; i<name.length(); i++){
            if(name.charAt(i) == ' '){
                spaceChar = i;
            }
        }
        System.out.println(name.substring(spaceChar,lastLength)+" "+name.substring(0,spaceChar));




    }
}

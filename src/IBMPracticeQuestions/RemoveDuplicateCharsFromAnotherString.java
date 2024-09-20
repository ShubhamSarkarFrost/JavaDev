package IBMPracticeQuestions;

import java.io.IOException;

public class RemoveDuplicateCharsFromAnotherString {

      public static String removeDuplicates(String sen, String word){
          boolean[] isPresentInStr2 = new boolean[128];

          for(int i = 0 ; i< word.length(); i++){
              isPresentInStr2[word.charAt(i)] = true;
          }

          //define StringBuilder
          StringBuilder result = new StringBuilder();

          // Loop through str1 and append characters that are not present in str2
          for(int i = 0; i< sen.length(); i++){
              if(!isPresentInStr2[sen.charAt(i)]){
                  result.append(sen.charAt(i));
              }
          }
          return result.toString();
      }

      public static void main(String[]Args) throws IOException {
          String str1 = "programming";
          String str2 = "mask";
          String result = removeDuplicates(str1, str2);
          System.out.println("Result after removing characters: " + result);
      }
}

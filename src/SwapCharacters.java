import java.io.IOException;
import java.util.Scanner;

public class SwapCharacters {

    public static String swapCharacters(String str){

        //check the null condition
        if(str == null || str.isEmpty()){
            return str;
        }

        char[] ch = str.toCharArray();

        //traverse the character array
        for(int i = 0; i <ch.length - 1; i+=2){
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
        }

        return new String(ch);
    }

    public static void main(String[]Args) throws IOException {

        System.out.println("Enter the sentence you want to do char swap with");
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String result = swapCharacters(sen);
        System.out.println("tHE rESULT is :");
        System.out.println(result);
    }
}

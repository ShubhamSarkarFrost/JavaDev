import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class PerfectlyBalancedString {

    public static boolean isperfectlyBalanced(String str){


        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){

            if(c == '(' || c =='{' || c== '['){
                stack.push(c);
            }else if( c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if(!isMatchingPair(top, c)){
                    return false;
                }
            }else {
                return false;
            }
        }

        return stack.isEmpty();



    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }


    public static void main(String[]Args) throws IOException {

        System.out.println("Please enter the string to check perfectly balance");
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isperfectlyBalanced(input));
        }




    }
}

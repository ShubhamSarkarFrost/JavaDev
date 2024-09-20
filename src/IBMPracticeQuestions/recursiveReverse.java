package IBMPracticeQuestions;

public class recursiveReverse {

    public static String reverseRecursive(String sen){
        if(sen == null || sen.length() <= 1){
            return sen;
        }

        return reverseRecursive(sen.substring(1)) + sen.charAt(0);
    }

    public static void main(String[]Args){
        String input = "hello";
        String result = reverseRecursive(input);
        System.out.println("Reversed string: " + result);
    }
}

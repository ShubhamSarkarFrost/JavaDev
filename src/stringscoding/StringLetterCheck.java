package stringscoding;

public class StringLetterCheck {

    public static void main(String[] args) {
        String firstString = "HelloWorld";
        String secondString = "Hello";

        boolean result = canFormString(firstString, secondString);
        System.out.println("Can form second string from first string: " + result);
    }

    private static boolean canFormString(String firstString, String secondString) {

        int[] firststringfrequency = new int[256];
        int[] secondstringfrequency = new int[256];

        for (char c : firstString.toCharArray()) {
            firststringfrequency[c]++;
        }

        for (char same : secondString.toCharArray()) {
            secondstringfrequency[same]++;
        }

        for (char c : secondString.toCharArray()) {
            if (secondstringfrequency[c] > firststringfrequency[c]) {
                return false;
            }

        }
        return true;
    }
}

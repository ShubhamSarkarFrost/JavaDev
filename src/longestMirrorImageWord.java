public class longestMirrorImageWord {

    public static void main(String[] args) {
        // Example strings to test the program
        String[] testStrings = {"abacdfgdcaba", "racecar", "abcba", "aabbcc", "abac"};

        for (String s : testStrings) {
            String result = findLongestMirrorImage(s);
            System.out.println("The longest mirror image string at both ends of \"" + s + "\" is: \"" + result + "\"");
        }
    }

    public static String findLongestMirrorImage(String str) {
        int n = str.length();
        String longestMirrorImage = "";

        for (int length = 1; length <= n / 2; length++) {
            String prefix = str.substring(0, length);
            String suffix = str.substring(n - length);

            if (isPalindrome(prefix) && prefix.equals(suffix)) {
                longestMirrorImage = prefix;
            }
        }

        return longestMirrorImage;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

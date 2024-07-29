public class longestSubstring {

      public static String longSubstring(String words) {
            int n = words.length();
            String longestSubstr = "";

            for (int index = 1; index < n / 2; index++) {
                  String prefix = words.substring(0, index);
                  String suffix = words.substring(n - index);
                  if (prefix.equals(suffix)) {
                        longestSubstr = prefix;
                  }
            }
            return longestSubstr;
      }
      public static void main(String[] args) {
            // Example strings to test the program
            String[] testStrings = {"abacdfgdcaba", "racecar", "abcba", "aabbcc", "abac"};

            for (String s : testStrings) {
                  String result = longSubstring(s);
                  System.out.println("The longest mirror image string at both ends of \"" + s + "\" is: \"" + result + "\"");
            }
      }
}

public class SecondHighestFrequencyWord {

    public static void main(String[] args) {
        // Example sentence
        String sentence = "the quick brown fox jumps over the lazy dog the fox is quick";

        // Find and print the word with the second highest frequency
        String result = getSecondHighestFrequencyWord(sentence);
        if (result != null) {
            System.out.println("The word with the second highest frequency is: " + result);
        } else {
            System.out.println("No second highest frequency word found.");
        }
    }

    public static String getSecondHighestFrequencyWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Array to store unique words
        String[] uniqueWords = new String[words.length];
        int[] frequencies = new int[words.length];
        int uniqueCount = 0;

        // Count the frequency of each word
        for (String word : words) {
            int index = -1;
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueWords[i].equals(word)) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                uniqueWords[uniqueCount] = word;
                frequencies[uniqueCount] = 1;
                uniqueCount++;
            } else {
                frequencies[index]++;
            }
        }

        // Find the highest and second highest frequencies
        int highestFreq = 0;
        int secondHighestFreq = 0;
        for (int i = 0; i < uniqueCount; i++) {
            if (frequencies[i] > highestFreq) {
                secondHighestFreq = highestFreq;
                highestFreq = frequencies[i];
            } else if (frequencies[i] > secondHighestFreq && frequencies[i] < highestFreq) {
                secondHighestFreq = frequencies[i];
            }
        }

        // Find the word with the second highest frequency
        for (int i = 0; i < uniqueCount; i++) {
            if (frequencies[i] == secondHighestFreq) {
                return uniqueWords[i];
            }
        }

        return null;
    }
}

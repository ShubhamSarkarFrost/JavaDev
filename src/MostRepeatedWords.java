public class MostRepeatedWords {

    public static String findMostFrequentWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return null;
        }

        // Convert the sentence to lowercase and split it into words
        String[] words = sentence.toLowerCase().split("\\W+");

        // Arrays to keep track of words and their frequencies
        String[] uniqueWords = new String[words.length];
        int[] frequencies = new int[words.length];
        int uniqueWordsCount = 0;

        // Count the frequency of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                boolean found = false;
                for (int i = 0; i < uniqueWordsCount; i++) {
                    if (uniqueWords[i].equals(word)) {
                        frequencies[i]++;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    uniqueWords[uniqueWordsCount] = word;
                    frequencies[uniqueWordsCount] = 1;
                    uniqueWordsCount++;
                }
            }
        }

        // Find the word with the highest frequency
        String mostFrequentWord = null;
        int maxFrequency = 0;
        for (int i = 0; i < uniqueWordsCount; i++) {
            if (frequencies[i] > maxFrequency) {
                maxFrequency = frequencies[i];
                mostFrequentWord = uniqueWords[i];
            }
        }

        return mostFrequentWord;
    }

    public static void main(String[] args) {
        String sentence1 = "This is a test. This test is simple. Simple test is the best test.";
        String sentence2 = "Hello world! Hello everyone. Welcome to the world of Java.";
        String sentence3 = "i am vendicated all these days i have been waiting all my life";

        System.out.println("Most frequent word in sentence1: " + findMostFrequentWord(sentence1));
        System.out.println("Most frequent word in sentence2: " + findMostFrequentWord(sentence2));
        System.out.println("Most frequent word in sentence3: " + findMostFrequentWord(sentence3));
    }

    }


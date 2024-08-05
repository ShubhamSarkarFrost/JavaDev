package arraycoding;

public class missingElement {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};

        int missingNumber = findMissingNumber(array);

        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1; // Since one number is missing, array length is n-1
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : array) {
            actualSum += num;
        }
        System.out.println("Expected Sum :"+ expectedSum);
        System.out.println("Actual Sum :"+ actualSum);

        return expectedSum - actualSum;
    }
}

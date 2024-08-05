package arraycoding;

public class MajorityElement {
        public static void main(String[] args) {
            int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};

            int majorityElement = findMajorityElement(array);

            if (isMajority(array, majorityElement)) {
                System.out.println("The majority element is: " + majorityElement);
            } else {
                System.out.println("There is no majority element.");
            }
        }

        public static int findMajorityElement(int[] array) {
            int candidate = findCandidate(array);
            return candidate;
        }

        private static int findCandidate(int[] array) {
            int count = 0;
            int candidate = -1;

            for (int num : array) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            return candidate;
        }

        private static boolean isMajority(int[] array, int candidate) {
            int count = 0;
            for (int num : array) {
                if (num == candidate) {
                    count++;
                }
            }
            return count > array.length / 2;
        }
    }

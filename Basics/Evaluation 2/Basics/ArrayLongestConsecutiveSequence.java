import java.util.Arrays;

class ArrayLongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] array = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence: " + longestConsecutiveSequenceLength(array));
    }

    public static int longestConsecutiveSequenceLength(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        array = SortingArrayAndString.sortingNumeric(array);
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] + 1) {
                currentCount++;
            } else if (array[i] != array[i - 1]) {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1;
            }
        }

        return Math.max(maxCount, currentCount);
    }
}

import java.util.Arrays;

class RemoveAllDuplicatesFromArray {
    public static int[] removeDuplicates(int[] array) {

        if (array == null || array.length <= 1)
            return array;

        boolean[] visited = new boolean[array.length];

        int uniqueCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                uniqueCount++;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == array[i]) {
                        visited[j] = true;
                    }
                }
            }
        }

        int[] result = new int[uniqueCount];
        int currentIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                result[currentIndex++] = array[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 6, 7};
        int[] result = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}


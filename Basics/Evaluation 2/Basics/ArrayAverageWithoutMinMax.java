import java.util.Arrays;

class ArrayAverageWithoutMinMax {

    public static void main(String[] args) {
        int[] array = {3, 6, 2, 9, 4, 8};

        double average = calculateAverageWithoutMinMax(array);
        System.out.println("Average excluding smallest and largest elements: " + average);
    }

    public static double calculateAverageWithoutMinMax(int[] array) {
        if (array.length <= 2) {
            System.out.println("Array has less than 3 elements. Cannot compute average.");
            return 0;
        }

        Arrays.sort(array);

        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }

        return (double) sum / (array.length - 2);
    }
}

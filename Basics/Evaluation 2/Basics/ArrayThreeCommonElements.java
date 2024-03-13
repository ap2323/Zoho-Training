import java.util.Arrays;

class ArrayThreeCommonElements {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 6, 7};
        int[] array2 = {2, 3, 6, 8};
        int[] array3 = {3, 6, 7, 9};

        System.out.println("Common elements:");
        findCommonElements(array1, array2, array3);
    }

    public static void findCommonElements(int[] array1, int[] array2, int[] array3) {
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length && k < array3.length) {
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                System.out.println(array1[i]);
                i++;
                j++;
                k++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else if (array2[j] < array3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}

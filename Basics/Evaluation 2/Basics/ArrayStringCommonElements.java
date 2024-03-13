import java.util.Arrays;

class ArrayStringCommonElements {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "orange", "kiwi", "grape"};
        String[] array2 = {"banana", "kiwi", "pear", "grape", "watermelon"};

        System.out.println("Common elements:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                    break;
                }
            }
        }
    }
}

class ArrayRemoveDuplicatesAndReturnLength {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 2, 5, 1, 6, 3};

        int length = removeDuplicatesAndGetLength(array);

        System.out.println("Length of array after removing duplicates: " + length);
    }

    public static int removeDuplicatesAndGetLength(int[] array) {
        int n = array.length;
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 1; 
        for (int i = 1; i < n; i++) {
            int current = array[i];
            boolean isDuplicate = false;

       
            for (int k = 0; k < j; k++) {
                if (array[k] == current) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                array[j++] = current;
            }
        }

        return j;
    }
}

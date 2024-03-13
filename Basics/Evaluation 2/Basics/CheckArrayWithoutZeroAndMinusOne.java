class CheckArrayWithoutZeroAndMinusOne {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5, 6};
        int[] array2 = {1, 0, 4, -1, 6};

        System.out.println("Array 1 check result: " + checkArray(array1));
        System.out.println("Array 2 check result: " + checkArray(array2));
    }

    public static boolean checkArray(int[] array) {
        for (int num : array) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
    }
}

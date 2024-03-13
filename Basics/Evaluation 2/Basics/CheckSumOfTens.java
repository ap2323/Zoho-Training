class CheckSumOfTens {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 10, 30, 10}; 
        int[] array2 = {10, 10, 10, 10};   

        System.out.println("Array 1 check result: " + checkSumOfTens(array1));
        System.out.println("Array 2 check result: " + checkSumOfTens(array2));
    }

    public static boolean checkSumOfTens(int[] array) {
        int sumOfTens = 0;

        for (int num : array) {
            if (num == 10) {
                sumOfTens += 10;
            }
        }

        return sumOfTens == 30;
    }
}

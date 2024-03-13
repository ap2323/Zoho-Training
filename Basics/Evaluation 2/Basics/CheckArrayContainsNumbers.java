class CheckArrayContainsNumbers {

    public static void main(String[] args) {
        int[] array1 = {65, 20, 77, 30, 10}; 
        int[] array2 = {10, 10, 10, 10};   

        System.out.println("Array 1 check result: " + checkArrayContainsNumbers(array1));
        System.out.println("Array 2 check result: " + checkArrayContainsNumbers(array2));
    }

    public static boolean checkArrayContainsNumbers(int[] array) {
        boolean isContains65 = false;
        boolean isContains77 = false;

        for (int num : array) {
            if (num == 65) {
                isContains65 = true;
            } else if (num == 77) {
                isContains77 = true;
            }
            if (isContains65 && isContains77) {
                break;
            }
        }

        return contains65 && contains77;
    }
}

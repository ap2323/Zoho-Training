public class Main {
    public static void FindMissingElement(String[] args) {
        
        int[] arr = {1,2,3,5,6};
        
        int missingElement = findMissingElement(arr);
        
        if (missingElement != -1) {
            System.out.println("Missing element: " + missingElement);
        } else {
            System.out.println("No missing element found.");
        }
    }

    public static int findMissingElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : arr) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int expectedSum = (max - min + 1) * (max + min) / 2;

        int missingElement = expectedSum - sum;

        return missingElement != 0 ? missingElement : -1;
    }
}

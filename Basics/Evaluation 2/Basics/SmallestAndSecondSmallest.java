class SmallestAndSecondSmallest {

    public static void main(String[] args) {
        int[] array = {12, 4, 7, 9, 2, 5};
        int[] smallestElements = findSmallestAndSecondSmallest(array);
        System.out.println("Smallest element: " + smallestElements[0]);
        System.out.println("Second smallest element: " + smallestElements[1]);
    }

    public static int[] findSmallestAndSecondSmallest(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            secondSmallest = smallest;
        }

        return new int[]{smallest, secondSmallest};
    }
}

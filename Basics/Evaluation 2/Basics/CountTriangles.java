import java.util.Arrays;
class CountTriangles {

    public static void main(String[] args) {
        int[] array = {4, 3, 7, 5, 6,6,7,8,8};
        int count = countTriangles(array);
        System.out.println("Number of triangles: " + count);
    }

    public static int countTriangles(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        
        // Fix one side of the triangle and use two pointers for other sides
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                // Check if current combination forms a valid triangle
                if (nums[i] + nums[left] > nums[right]) {
                    // If so, all triangles formed with the right side are valid
                    // Increment count by the number of valid triangles
                    count += (right - left);
                    right--;
                } else {
                    // If not, move left pointer to increase the sum of sides
                    left++;
                }
            }
        }

        return count;
    }
}

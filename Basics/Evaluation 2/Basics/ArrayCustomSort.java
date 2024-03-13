import java.util.Arrays;
class ArrayCustomSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        customSort(arr);
    }

    public static void customSort(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        
        while(left<right) {
            System.out.print(arr[right--]+" ");
            System.out.print(arr[left++]+" ");
            if(left == right) {
            	System.out.println(arr[left] + " ");
            }
        }

    }
}

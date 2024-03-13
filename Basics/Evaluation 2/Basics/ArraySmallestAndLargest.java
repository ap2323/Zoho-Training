import java.util.*;
clas ArraySmallestAndLargest{
    public static void main(String[] args) {
        int[] arr = {34, 6, 78, 13, 55, 9};
        
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        
        System.out.println("Max value is :" +max);
        System.out.println("Min value is :" +min);
    }

    
}

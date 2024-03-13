import java.util.*;
class ArraySmallestAndLargest2{
    public static void main(String[] args) {
        int[] arr = {34, 6, 78, 13, 55, 9};
        
		if(arr.length >= 1) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int i = 1; i < arr.length; i++){
				if(arr[i] > max){
					max = arr[i];
				}
				if(arr[i] < min){
					min = arr[i];
				}
			}
		} else {
			System.out.println("Array length should be greater then 1!");
		}
        
        
        System.out.println("Max value is :" +max);
        System.out.println("Min value is :" +min);
    }

    
}

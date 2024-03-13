import java.util.Scanner;
import java.util.Arrays;

class ArrayFindSmallestSubArray {
	int[] array;
	int[] resultArray;
	Scanner scanner = new Scanner(System.in);
	
	void findLargestSubArray() {
		int currentLength =1, maxLength = Integer.MAX_VALUE;
		int startIndex=0, endIndex=0;
		for(int i=1; i<array.length; i++) {
			if(array[i] > array[i-1]) {
				currentLength++;
			} else {
				if(currentLength < maxLength) {
					maxLength = currentLength;
					endIndex = i-1;
					startIndex = (endIndex - maxLength) + 1;
				}
				currentLength = 1;	
			}
			
		}
		if(currentLength < maxLength && currentLength > 1) {
			maxLength = currentLength;
			endIndex = array.length - 1;
			startIndex = (endIndex - maxLength) + 1;
		}
		System.arraycopy(array, startIndex, resultArray, 0, maxLength);
		System.out.println(Arrays.toString(Arrays.copyOf(resultArray, maxLength)));	
		
	}
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new int[size];
		resultArray = new int[size];
		
		System.out.println("Enter the elements:");
		
		for (int i=0; i<size; i++){
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Array is: " + Arrays.toString(array));
	
		findLargestSubArray();
		
	}
	
	public static void main(String[] args){
		
		ArrayFindSmallestSubArray arrayFindSmallestSubArray = new ArrayFindSmallestSubArray();
		arrayFindSmallestSubArray.getInput();
		
	}
	
}
	

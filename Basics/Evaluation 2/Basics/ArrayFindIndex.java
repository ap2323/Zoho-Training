import java.util.Scanner;
import java.util.Arrays;

class ArrayFindIndex {
	int[] array;
	Scanner scanner = new Scanner(System.in);
	
	public int findIndex(int[] array, int value) {
    		int left = 0;
    		int right = array.length - 1;
    
    		while (left <= right) {
        		int mid = left + (right - left) / 2;
        
        		if (array[mid] == value) {
            			return mid;
        		} else if (array[mid] < value) {
           	 		left = mid + 1;
        		} else {
            			right = mid - 1;
        		}		
    		}
    
    		return -1;
	}
	
	void getInput(){
		int num;
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new int[size];
		
		System.out.println("Enter the elements:");
		
		for (int i=0; i<size; i++){
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Sorted Array is: " + Arrays.toString(array));
		
		System.out.println("Enter number to find index:");
		num = scanner.nextInt();
		
		
		System.out.println("Index is: " + findIndex(array,num));
		
	}
	
	public static void main(String[] args){
		
		ArrayFindIndex arrayFindIndex = new ArrayFindIndex();
		arrayFindIndex.getInput();
		
	}
	
}
	

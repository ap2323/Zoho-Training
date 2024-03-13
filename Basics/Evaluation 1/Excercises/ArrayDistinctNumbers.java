import java.util.Scanner;
import java.util.Arrays;

class ArrayDistinctNumbers {
	
	int[] array;
	int[] resultArray;
	boolean isFound = true;
	
	Scanner scanner = new Scanner(System.in);
	
	void findDistinct() {
		int index=0;
		for(int i=0; i<array.length; i++) {
			isFound = true;
			for(int j=0; j<array.length; j++) {
				if(i != j && array[i] == array[j]) {
					isFound = false;
					break;
						
				}
			}
			if(isFound) resultArray[index++] = array[i];
		}
		
	
		System.out.println("Result Array is: " + Arrays.toString(Arrays.copyOf(resultArray, index)));
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
		
		findDistinct();
		
	}
	
	public static void main(String[] args){
		
		ArrayDistinctNumbers arrayDistinctNumbers = new ArrayDistinctNumbers();
		arrayDistinctNumbers.getInput();
		
	}
	
}
	

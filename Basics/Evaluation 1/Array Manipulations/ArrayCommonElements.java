import java.util.Scanner;
import java.util.Arrays;

class ArrayCommonElements {
	
	int[] array1, array2, resultArray;
	
	Scanner scanner = new Scanner(System.in);
	
	void findCommonElements() {
		int count=0;
		System.out.println("Common elements: ");
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if(array1[i] == array2[j]) {
					resultArray[count++] = array1[i];
				} 
				
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOf(resultArray, count)));
	}

	void getInput(){
		
		System.out.println("Enter the size of the array-1:");
		int size1 = scanner.nextInt();
	
		array1 = new int[size1];
		
		System.out.println("Enter the elements:");
		for (int i=0; i<size1; i++){
			array1[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the size of the array-2:");
		int size2 = scanner.nextInt();
		
		array2 = new int[size2];
		
		System.out.println("Enter the elements:");
		for (int i=0; i<size2; i++){
			array2[i] = scanner.nextInt();
		}
		
		resultArray = new int[Math.max(size1,size2)];
		
	}
	
	public static void main(String[] args){
		
		ArrayCommonElements arrayCommonElements = new ArrayCommonElements();
		arrayCommonElements.getInput();
		arrayCommonElements.findCommonElements();
		
	}
	
}
	

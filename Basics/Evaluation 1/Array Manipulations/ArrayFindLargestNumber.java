import java.util.Scanner;

//find largest element
class ArrayFindLargestNumber {

	int[] array;
	Scanner scanner = new Scanner(System.in);
	
	void findThirdLargest() {
	
		int max1 = Integer.MIN_VALUE;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i] > max1 ) {

				max1 = array[i];
				
			} 
			
		}
		
		System.out.println("Largest number: " + max1);
		
	}
	
	void getInput() {
		
		System.out.println("Enter the Size of Array: ");
		short size = scanner.nextShort();
		
		array = new int[size];
		
		for(int i=0; i<size; i++) {
			
			System.out.println("Enter element " + (i+1) + ": ");
			array[i] = scanner.nextShort();
			
		}
		
		for(int j : array) {
			System.out.println("Array is: " + j);
		}
		
	}
	
	public static void main(String[] args) {
	
		ArrayFindLargestNumber arrayFindLargestNumber = new ArrayFindLargestNumber();
		arrayFindLargestNumber.getInput();
		arrayFindLargestNumber.findThirdLargest();
		
	}
	
}

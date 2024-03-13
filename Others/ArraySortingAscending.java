import java.util.Scanner;
import java.util.Arrays;

class ArraySortingAscending {
	
	int[] array;
	
	Scanner scanner = new Scanner(System.in);
	
	void sorting() {
		
		int temp;
		for(int i=0; i<array.length; i++){
			for(int j=(i+1); j<array.length; j++){
				
				if(array[i] > array[j]) {
					
					temp = array[i];
					
					array[i] = array[j];
					array[j] = temp;
					
				}
				
			}
			
		}
		System.out.println("Asecnding order: " + Arrays.toString(array));
		
	}
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new int[size];
		
		System.out.println("Enter the elements:");
		for (int i=0; i<size; i++){
			array[i] = scanner.nextInt();
		}
		
	}
	
	public static void main(String[] args){
		
		ArraySortingAscending arraySortingAscending = new ArraySortingAscending();
		arraySortingAscending.getInput();
		arraySortingAscending.sorting();
		
	}
	
}

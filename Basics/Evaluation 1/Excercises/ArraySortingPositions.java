import java.util.Scanner;
import java.util.Arrays;

class ArraySortingPositions {
	int array[];
	Scanner scanner = new Scanner(System.in);
	
	private void sorting() {
		int temp=0;
		//for odd position
		for(int i=1; i<array.length; i+=2) {
			for(int j=(i+2); j<array.length; j+=2) {
				if(array[i] > array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		}
		
		//even position
		for(int i=0; i<array.length; i+=2) {
			for(int j=(i+2); j<array.length; j+=2) {
				if(array[i] < array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(array));
	}
				
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new int[size];
		
		System.out.println("Enter the elements:");
		for (int i=0; i<size; i++){
			array[i] = scanner.nextInt();
		}
		
		sorting();
		
	}
	
	public static void main(String[] args){
		
		ArraySortingPositions arraySorting = new ArraySortingPositions();
		arraySorting.getInput();
		
	}
	
}
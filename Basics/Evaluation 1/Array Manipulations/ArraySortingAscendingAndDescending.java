import java.util.Scanner;
import java.util.Arrays;

class ArraySortingAscendingAndDescending {
	
	int[] orgArray;
	
	Scanner scanner = new Scanner(System.in);
	
	void sorting() {
		
		int temp;
		//Sorting in ascending order
		for(int i=0; i<orgArray.length; i++){
			for(int j=(i+1); j<orgArray.length; j++){
				
				if(orgArray[i] > orgArray[j]) {
					
					temp = orgArray[i];
					
					orgArray[i] = orgArray[j];
					orgArray[j] = temp;
					
				}
				
			}
			
		}
		System.out.println("Asecnding order: " + Arrays.toString(orgArray));
		//Sorting in descending order
		for(int i=0; i<orgArray.length; i++){
			for(int j=(i+1); j<orgArray.length; j++){
				
				if(orgArray[i] < orgArray[j]) {
					
					temp = orgArray[i];
					
					orgArray[i] = orgArray[j];
					orgArray[j] = temp;
					
				}
				
			}
			
		}
		System.out.println("Descending order: " + Arrays.toString(orgArray));
		
			
	}
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		orgArray = new int[size];
		
		System.out.println("Enter the elements:");
		for (int i=0; i<size; i++){
			orgArray[i] = scanner.nextInt();
		}
		
	}
	
	public static void main(String[] args){
		
		ArraySortingAscendingAndDescending arraySortingAscendingAndDescending = new ArraySortingAscendingAndDescending();
		arraySortingAscendingAndDescending.getInput();
		arraySortingAscendingAndDescending.sorting();
		
	}
	
}
	

import java.util.Scanner;

//find largest and smallest in Array
class ArrayFindLargestAndSmallestNumber {
	
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
		
		
		for(int n=0; n<orgArray.length; n++) {
			if(n==0) {
				
				System.out.println("Smallest number: " + orgArray[n]);
			}
			if(n==(orgArray.length-1)) {
				
				System.out.println("Largest number: " + orgArray[n]);
				
			}
			
		}
		
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
		
		ArrayFindLargestAndSmallestNumber arrayFindLargestAndSmallestNumber = new ArrayFindLargestAndSmallestNumber();
		arrayFindLargestAndSmallestNumber.getInput();
		arrayFindLargestAndSmallestNumber.sorting();
		
	}
	
}
	

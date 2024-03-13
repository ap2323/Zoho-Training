import java.util.Scanner;
import java.util.Arrays;

class ArrayRotateElements {
	
	int[] orgArray;
	int n;
	Scanner scanner = new Scanner(System.in);
	
	void rotate() {
		
		int k=orgArray.length;
		n = n%k;
		if(n < 0) {
			n = n+k;
		}
		
		reverse(orgArray, k-n, k-1);
		reverse(orgArray, 0, k-n-1);
		reverse(orgArray, 0, k-1);
		
		System.out.println("After rotate: " + Arrays.toString(orgArray));
	}
	
	void reverse(int[] array, int start, int end) {
		int temp=0;
		while(start<end) {
				
			temp = orgArray[start];
					
			orgArray[start] = orgArray[end];
			orgArray[end] = temp;
					
			start++;
			end--;
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
		
		System.out.println("Enter no. of times rotate:");
		n = scanner.nextInt();
		
		
	}
	
	public static void main(String[] args){
		
		ArrayRotateElements arrayRotateElements = new ArrayRotateElements();
		arrayRotateElements.getInput();
		arrayRotateElements.rotate();
		
	}
	
}
	

import java.util.Scanner;
import java.util.Arrays;

class ArrayFindIndex {
	int[] array;
	Scanner scanner = new Scanner(System.in);
	
	void findIndex(int num) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == num) {
				System.out.println("Index is : " + i);
				break;
			} else {
				if(i==array.length-1) {
					System.out.println("Index is : -1");
				}
			}
		}
			
		
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
		
		System.out.println("Array is: " + Arrays.toString(array));
		
		System.out.println("Enter number to find index:");
		num = scanner.nextInt();
		
		
		findIndex(num);
		
	}
	
	public static void main(String[] args){
		
		ArrayFindIndex arrayFindIndex = new ArrayFindIndex();
		arrayFindIndex.getInput();
		
	}
	
}
	

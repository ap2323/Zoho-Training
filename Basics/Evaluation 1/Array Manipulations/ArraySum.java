import java.util.Scanner;

class ArraySum {
	
	int[] array;
	
	Scanner scanner = new Scanner(System.in);
	
	void findSum() {
		int sum=0;
		
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
	
		System.out.println("Sum of Array is: " + sum);
	}
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new int[size];
		
		System.out.println("Enter the elements:");
		for (int i=0; i<size; i++){
			array[i] = scanner.nextInt();
		}
		
		findSum();
		
	}
	
	public static void main(String[] args){
		
		ArraySum arraySum = new ArraySum();
		arraySum.getInput();
		
	}
	
}
	

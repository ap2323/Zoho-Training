import java.util.Scanner;

//Avg Array
class ArrayAvg {
	
	int[] array;
	
	Scanner scanner = new Scanner(System.in);
	
	void findAvg() {
		int sum=0;
		
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
	
		System.out.println("Average of Array is: " + sum/array.length);
	}
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new int[size];
		
		System.out.println("Enter the elements:");
		for (int i=0; i<size; i++){
			array[i] = scanner.nextInt();
		}
		
		findAvg();
		
	}
	
	public static void main(String[] args){
		
		ArrayAvg arrayAvg = new ArrayAvg();
		arrayAvg.getInput();
		
	}
	
}
	

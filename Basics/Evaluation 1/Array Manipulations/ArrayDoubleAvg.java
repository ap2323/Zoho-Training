import java.util.Scanner;

class ArrayDoubleAvg {
	
	double[] array;
	
	Scanner scanner = new Scanner(System.in);
	
	void findAvg() {
		double sum=0;
		
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		
		System.out.println("Sum of Array is: " + (double)sum/array.length);
	}
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new double[size];
		
		System.out.println("Enter the elements:");
		for (int i=0; i<size; i++){
			array[i] = scanner.nextDouble();
		}
		
		findAvg();
		
	}
	
	public static void main(String[] args){
		
		ArrayDoubleAvg arrayDoubleAvg = new ArrayDoubleAvg();
		arrayDoubleAvg.getInput();
		
	}
	
}
	

import java.util.Scanner;
import java.util.Arrays;

class ArrayCopy {
	int[] array;
	static int[] result;
	int number,index;
	Scanner scanner = new Scanner(System.in);
	
	public static int[] copyOf(int[] array, int length) {
		result = new int[length];
		
    		for(int i=0; i<length; i++) {
    			result[i] = array[i];
    		}
    		
    		return result;
	}
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new int[size];
		
		System.out.println("Enter the elements:");
		
		for (int i=0; i<size; i++){
			array[i] = scanner.nextInt();
		}
		
		
		array = copyOf(array, array.length);
		
		System.out.println("After remove " + Arrays.toString(array));
		
	}
	
	public static void main(String[] args){
		
		ArrayCopy arrayCopy = new ArrayCopy();
		arrayCopy.getInput();
		
	}
	
}
	

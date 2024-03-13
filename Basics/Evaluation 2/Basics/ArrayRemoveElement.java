import java.util.Scanner;
import java.util.Arrays;

class ArrayRemoveElement {
	int[] array;
	int number,index;
	Scanner scanner = new Scanner(System.in);
	
	public void remove() {
    		for(int i=0; i<array.length; i++) {
    			if(array[i] == number) {
    				index = i;
    				swap();
    				array = ArrayCopy.copyOf(array,array.length-1);
    				break;
    			}
    		}
	}
	
	public void swap() {
		for (int j = index; j < array.length-1; j++) {
            		array[j] = array[j + 1];
        	}
        }
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new int[size];
		
		System.out.println("Enter the elements:");
		
		for (int i=0; i<size; i++){
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Enter number to remove:");
		number = scanner.nextInt();
		
		remove();
		
		System.out.println("After remove " + Arrays.toString(array));
		
	}
	
	public static void main(String[] args){
		
		ArrayRemoveElement arrayRemoveElement = new ArrayRemoveElement();
		arrayRemoveElement.getInput();
		
	}
	
}
	

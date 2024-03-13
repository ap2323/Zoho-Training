import java.util.Scanner;
import java.util.Arrays;

class ArrayInsertElement {
	int[] array;
	int number,index;
	Scanner scanner = new Scanner(System.in);
	
	public void insert() {
    		for(int i=0; i<array.length; i++) {
    			if(i == index) {
    				swap();
    				array[i] = number;
    				break;
    			}
    		}
	}
	
	public void swap() {
		for (int j = array.length-1; j > index; j--) {
            		array[j] = array[j - 1];
        	}
        }
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		array = new int[size+1];
		
		System.out.println("Enter the elements:");
		
		for (int i=0; i<size; i++){
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Enter index to insert: ");
		index = scanner.nextInt();
		
		System.out.println("Enter number to insert: ");
		number = scanner.nextInt();
		
		insert();
		
		System.out.println("After insert: " + Arrays.toString(array));
		
	}
	
	public static void main(String[] args){
		
		ArrayInsertElement arrayInsertElement = new ArrayInsertElement();
		arrayInsertElement.getInput();
		
	}
	
}
	

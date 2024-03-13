import java.util.Scanner;
import java.util.Arrays;

class SearchElementInArray{
	
	static int[] array;
	int array_size, search_element;
	Scanner scanner = new Scanner(System.in);
	public boolean contains(int[] array, int value) {
    		int left = 0;
    		int right = array.length - 1;
    
    		while (left <= right) {
        		int mid = left + (right - left) / 2;
        
        		if (array[mid] == value) {
            			return true;
        		} else if (array[mid] < value) {
           	 		left = mid + 1;
        		} else {
            			right = mid - 1;
        		}		
    		}
    
    		return false;
	}
	
	private void getInput() {
	
		System.out.println("Enter size of Numeric array: ");
		array_size = scanner.nextInt();
		
		array = new int[array_size];
		
		System.out.println("Enter the elements of numeric Array:");
		
		for(int i=0; i<array_size; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Enter search element: ");
		search_element = scanner.nextInt();
		
		if(contains(array,search_element)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found!");
		}
	}
	
	public static void main(String[] args) {
		SearchElementInArray searchElementInArray = new SearchElementInArray();
		searchElementInArray.getInput();
	}
}




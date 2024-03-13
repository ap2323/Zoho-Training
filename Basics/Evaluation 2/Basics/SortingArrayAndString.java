import java.util.Arrays;
import java.util.Scanner;
class SortingArrayAndString {
	int[] numeric_array;
	String[] string_array;
	int numericArray_size, stringArray_size;
	Scanner scanner = new Scanner(System.in);
	
	public static int[] sortingNumeric(int[] numeric_array) {
	
		int n = numeric_array.length;
		int temp =0;

            	for (int i = 0; i < n-1; i++) {
                	if (numeric_array[i] > numeric_array[i + 1]) {
                    			
                    		temp = numeric_array[i];
                    		numeric_array[i] = numeric_array[i + 1];
                    		numeric_array[i + 1] = temp;
                    		
                	}
                	if(i>0) {
                		if (numeric_array[i-1] > numeric_array[i]) {
                    			
                    		temp = numeric_array[i];
                    		numeric_array[i] = numeric_array[i - 1];
                    		numeric_array[i - 1] = temp;
                    		i=0;
                		}
                	}
	
            	}
			return numeric_array;
		
	}
	
	private void sortingString() {
	
		String temp;
		for(int i = 0; i<string_array.length; i++) {
			
			for(int j = 1; j<string_array.length-i; j++) {
				int pos=0;
				while((pos < string_array[j].length() && pos < string_array[j-1].length()) &&
				Character.toLowerCase(string_array[j].charAt(pos)) == Character.toLowerCase(string_array[j-1].charAt(pos)) ) {
					
					pos++;
					
					
				}
				if((pos < string_array[j].length() && pos < string_array[j-1].length()) &&
				Character.toLowerCase(string_array[j].charAt(pos)) < Character.toLowerCase(string_array[j-1].charAt(pos)) ) {
					temp = string_array[j-1];
					
					string_array[j-1] = string_array[j];
					string_array[j] = temp;
				}
				
				
			}
			
		}
		
		System.out.println(Arrays.toString(string_array));
	}
	
	private void getInput() {
	
		System.out.println("Enter size of Numeric array: ");
		numericArray_size = scanner.nextInt();
		
		numeric_array = new int[numericArray_size];
		
		System.out.println("Enter the elements of numeric Array:");
		
		for(int i=0; i<numericArray_size; i++) {
			numeric_array[i] = scanner.nextInt();
		}
		System.out.println("After: " + Arrays.toString(sortingNumeric(numeric_array)));
		
		System.out.println("Enter size of String array: ");
		stringArray_size = scanner.nextInt();
		
		string_array = new String[stringArray_size];
		scanner.nextLine();
		System.out.println("Enter the elements of string Array:");
		
		for(int i=0; i<stringArray_size; i++) {
			string_array[i] = scanner.nextLine();
		}
	}
	
	public static void main(String[] args) {
		SortingArrayAndString sortingArrayAndString = new SortingArrayAndString();
		sortingArrayAndString.getInput();
		sortingArrayAndString.sortingString();
	}
	
}

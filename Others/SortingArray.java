import java.util.Arrays;

class SortingArray {
	int[] numeric_array = {100,80,20,10};
	private void sorting() {
	
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
            			
        	
		System.out.println("After: " + Arrays.toString(numeric_array));
	}
	
	public static void main(String[] args) {
		SortingArray sortingArray = new SortingArray();
		sortingArray.sorting();
	}
}

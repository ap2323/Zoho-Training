import java.util.Arrays;

class ReverseArray {
	int[] array = {50,40,80,20};
	private void reverse() {
		int n = array.length;
		int temp =0;
        		
            	for (int i=0; i<n/2; i++) {	
                    	temp = array[i];
                    	array[i] = array[n - i - 1];
                    	array[n-i-1] = temp;
                }
            			
		System.out.println("After: " + Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		reverseArray.reverse();
	}
	
}

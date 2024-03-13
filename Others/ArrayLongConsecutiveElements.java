import java.util.Arrays;

class ArrayLongConsecutiveElements {
	int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
	
	private void findConsecutiveElements() {
		Arrays.sort(array);
		int startIndex = 0; int endIndex =0;
		int maxLength =0, count=1;
		for(startIndex=1; startIndex < array.length; startIndex++) {
			
				if(array[startIndex] > array[startIndex-1]) {
					if (array[startIndex-1]+ 1 == array[startIndex]){
						count++;
					}
				} 
			}
		
		System.out.println("Length is: " + count);
		
	}
	
	public static void main(String[] args){
		
		ArrayLongConsecutiveElements arrayLongConsecutiveElements = new ArrayLongConsecutiveElements();
		arrayLongConsecutiveElements.findConsecutiveElements();
		
	}
	
}
			

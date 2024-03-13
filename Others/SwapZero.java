import java.util.Arrays;
class SwapZero {
	int[] array = { 0,0,0,1,2,3};
	
	private void swap() {
	int temp=0, n = array.length;
	
		for(int i=0; i <n-1; i++) {
			if(array[i] == 0 && array[i+1] != 0)  {
				temp = array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
			}
			if(i>0) {
                		if (array[i-1]==0 && array[i]!=0) {
                    			
                    		temp = array[i];
                    		array[i] = array[i - 1];
                    		array[i - 1] = temp;
                    		i=0;
                		}
                	}
				
			
		
	}
		System.out.println("After: " + Arrays.toString(array));
		
	}
	
	public static void main(String[] args) {
		SwapZero swapZero = new SwapZero();
		swapZero.swap();
	}
}

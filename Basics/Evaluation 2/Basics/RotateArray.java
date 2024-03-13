import java.util.Arrays;

class RotateArray {
	int[] array = {1,2,3,4,5};
	//clockwise
	private void rotate() {
		int times = 1;
		for(int i=0; i<times; i++){
		int lastElement = array[array.length-1];
      
        	swap();
        	array[0] = lastElement;
        	}
		System.out.println(Arrays.toString(array));
	}
	private void swap() {
		for (int j = array.length-1; j > 0; j--) {
            		array[j] = array[j - 1];
        	}
        }
	public static void main(String[] args) {
		RotateArray rotateArray = new RotateArray();
		rotateArray.rotate();
	}
}

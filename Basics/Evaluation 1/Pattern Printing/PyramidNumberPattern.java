import java.util.Scanner;

class PyramidNumberPattern {
	
	Scanner scanner = new Scanner(System.in);
	int size,num=1;
	
	private void printPattern(){
		//upper half
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-i-1; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<= 2 * i + 1; k++) {
				if(num > 9){
					num = 1;
					
				}
				System.out.print(num);
				num++;
				
			}
			System.out.println();
		}
	}
	
	private void getInput() {
		System.out.println("Enter Size: ");
		size = scanner.nextInt();
		
		printPattern();
	}
	public static void main(String[] args){
		PyramidNumberPattern pyramidNumberPattern = new PyramidNumberPattern();
		pyramidNumberPattern.getInput();
	}
	
}
import java.util.Scanner;

class LeftTrianglePattern {
	
	Scanner scanner = new Scanner(System.in);
	int size;
	
	private void printPattern(){
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
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
		LeftTrianglePattern leftTrianglePattern = new LeftTrianglePattern();
		leftTrianglePattern.getInput();
	}
	
}
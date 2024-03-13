import java.util.Scanner;

class RightTrianglePattern {
	
	Scanner scanner = new Scanner(System.in);
	int size;
	
	private void printPattern(){
		for(int i=1; i<=size; i++) {
			for(int j=0; j<i; j++) {
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
		RightTrianglePattern rightTrianglePattern = new RightTrianglePattern();
		rightTrianglePattern.getInput();
	}
	
}
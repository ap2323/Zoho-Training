import java.util.Scanner;

class SquarePattern {
	
	Scanner scanner = new Scanner(System.in);
	int size;
	
	private void printPattern(){
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
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
		SquarePattern squarePattern = new SquarePattern();
		squarePattern.getInput();
	}
	
}
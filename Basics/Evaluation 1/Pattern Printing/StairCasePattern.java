import java.util.Scanner;

class StairCasePattern {
	
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
		StairCasePattern stairCasePattern = new StairCasePattern();
		stairCasePattern.getInput();
	}
	
}
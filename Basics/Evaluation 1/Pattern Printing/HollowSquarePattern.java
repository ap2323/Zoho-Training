import java.util.Scanner;

class HollowSquarePattern {
	
	Scanner scanner = new Scanner(System.in);
	int size;
	
	private void printPattern(){
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(i==0 || i==size-1 || j==0 || j==size-1){
					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
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
		HollowSquarePattern hollowSquarePattern = new HollowSquarePattern();
		hollowSquarePattern.getInput();
	}
	
}
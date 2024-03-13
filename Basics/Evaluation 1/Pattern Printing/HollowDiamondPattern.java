import java.util.Scanner;

class HollowDiamondPattern {
	
	Scanner scanner = new Scanner(System.in);
	int size;
	
	private void printPattern(){
		//upper half
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<= 2 * i - 1; k++) {
				if(k==1 || k==2 * i - 1) {
					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//Lower Half
		for(int i=size-2; i>=0; i--) {
			for(int j=0; j<size-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k <= 2 * i - 1; k++) {
				if(k==1 || k==2 * i - 1) {
					
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
		HollowDiamondPattern hollowDiamondPattern = new HollowDiamondPattern();
		hollowDiamondPattern.getInput();
	}
	
}
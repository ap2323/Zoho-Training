import java.util.Scanner;

class Factorial {

	int n;
	long fact;
	Scanner scanner = new Scanner(System.in);
	
	long fact(int n){
		if(n == 0) {
			
			return 1;
		}
		return n * fact(n-1);
	
	}
	
	void getInput() {
		
		System.out.println("Enter the number: ");
		n = scanner.nextInt();
		
		if( n < 0 ) {
			System.out.println("Negative number cannot be factorial!");
			getInput();
		} else {
		
			System.out.println("Factorial is: " + fact(n));
		}
		
	}
	
	public static void main(String[] args) {
		
		Factorial factorial = new Factorial();
		factorial.getInput();
		
	}
	
}

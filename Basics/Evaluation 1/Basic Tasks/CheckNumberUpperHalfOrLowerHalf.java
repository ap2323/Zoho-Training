import java.util.Scanner;

//check number is 1-50 or 50 -100
class CheckNumberUpperHalfOrLowerHalf {

	Scanner scanner = new Scanner(System.in);
	short number;
	
	void checkRange(int num) {
		
		if(num >= 1 & num <= 50){
			System.out.println("The number is in the lower half!");
		} else if(num > 50 & num <=100) {
			 System.out.println("The number is in the upper half!");
		} else {
			System.out.println("Invalid Number!");
		}
		
	}
	
	void getInput(){
		
		System.out.println("Enter the Number: ");
		number = scanner.nextShort();
		
		checkRange(number);
		
	}
	
	public static void main(String[] args) {
		
		CheckNumberUpperHalfOrLowerHalf checkNumberUpperHalfOrLowerHalf = new CheckNumberUpperHalfOrLowerHalf();
		checkNumberUpperHalfOrLowerHalf.getInput();
		
	}
}

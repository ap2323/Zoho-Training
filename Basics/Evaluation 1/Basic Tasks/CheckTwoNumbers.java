import java.util.Scanner;


//checking 2 numbers are greater or equal
class CheckTwoNumbers {
	
	int num1, num2;
	Scanner scanner = new Scanner(System.in);
	
	//validating the input
	void output(int num1, int num2) {
	
		if(num1>num2) {
			System.out.println("Num1 is greater than Num2!");
		} else if(num1 == num2){
			System.out.println("Num1 is equal to Num2!");
		} else {
			System.out.println("Num1 is lesser than Num2!");
		}
	}	
	
	//get input from user
	void getInput(){
		System.out.println("Enter num1:");
		num1 = scanner.nextInt();
		System.out.println("Enter num2:");
		num2 = scanner.nextInt();
		
		output(num1,num2);
	}
		
	public static void main(String[] args) {
		
		CheckTwoNumbers checkTwoNumbers = new CheckTwoNumbers();
		checkTwoNumbers.getInput();
	}
}

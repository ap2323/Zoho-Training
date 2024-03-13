import java.util.Scanner;

//Sum of two numbers
class SumOfTwoNumbers {

	Scanner scanner = new Scanner(System.in);
	int num1, num2;
	
	int sum(int num1, int num2) {
		return (num1+num2);
	}
	
	void getInput(){
		
		System.out.println("Enter the number1: ");
		num1 = scanner.nextInt();
		System.out.println("Enter the number1: ");
		num2 = scanner.nextInt();
		
		System.out.println("Sum is: " + sum(num1, num2));
		
	}
	
	public static void main(String[] args) {
		
		SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
		sumOfTwoNumbers.getInput();
		
	}
}

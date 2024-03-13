import java.util.Scanner;

public class LCMOfTwoNumbers {
	Scanner scanner = new Scanner(System.in);
	int num1,num2;
	private void getInput() {
		
		System.out.println("Enter two numbers");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		 
		System.out.println("LCM of "+num1 +" and "+num2 + " is : " +findLCM(num1,num2)); 
	} 
	public static void main(String[] args) {
		LCMOfTwoNumbers lcmOfTwoNumbers = new LCMOfTwoNumbers();
		lcmOfTwoNumbers.getInput();
	}
	static int findLCM(int num1, int num2){
	    int lcm = num1 * num2 / findGCD(num1, num2);
	    return lcm;
	}
	public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

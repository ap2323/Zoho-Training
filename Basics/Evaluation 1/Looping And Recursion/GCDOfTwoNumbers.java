import java.util.Scanner;

public class GCDOfTwoNumbers
{
	Scanner scanner = new Scanner(System.in);
	int num1,num2;
	
	private void getInput() {
		System.out.println("Enter two numbers");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		 
		System.out.println("GCD of " +num1 +" and "+num2 +" is : "+findGCD(num1,num2)); 
	}
	
	public static void main(String[] args) {
		
		GCDOfTwoNumbers gcdOfTwoNumbers = new GCDOfTwoNumbers();
		gcdOfTwoNumbers.getInput();
	}
	
	int findGCD(int num1, int num2){
	    if(num1 % num2 == 0){
	        return num2;
	    }
	    else{
	        return findGCD(num2, num1 % num2);
	    }
	}
}

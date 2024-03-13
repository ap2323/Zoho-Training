import java.util.Scanner;

public class PrimeNumberCheck
{
	Scanner in = new Scanner(System.in);
	int number;
	void getInput() {
		
		System.out.println("Enter the number");
		number = in.nextInt();
	
	
		if(isPrimeNumber(number)) {
			System.out.println("Prime Number!");
		}else {
			System.out.println("Not Prime Number!");
		}
	}
	boolean isPrimeNumber(int number){
	    return helper(number , number - 1);
	}
	
	boolean helper(int n, int divisor)
	{
	    if(n < 2){
	        return false;
	    }
	    
	    if(divisor == 1){
	        return true;
	    }
	    if(n % divisor == 0){
	        return false;
	    }
	    return helper(n, divisor - 1);
	}
	public static void main(String[] args) {
		PrimeNumberCheck primeNumberCheck = new PrimeNumberCheck();
		primeNumberCheck.getInput();
	}
	
}

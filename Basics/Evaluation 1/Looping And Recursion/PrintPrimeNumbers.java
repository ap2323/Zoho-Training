import java.util.Scanner;

public class PrintPrimeNumbers {
	Scanner scanner = new Scanner(System.in);
	int range;
	private void getInput() {
		System.out.println("Enter the range of prime numbers");
        	range = scanner.nextInt();
         
        	generatePrimes(range);
        }
	
	public void generatePrimes(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. Please provide a positive value for n.");
            return;
        }

        int count = 0;
        int num = 3;

        System.out.println("First " + n + " prime numbers:");
        System.out.print(2 + " ");
        
        while (count < n-1) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num+=2;
        }

        System.out.println();
    }
    
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {
         
         PrintPrimeNumbers printPrimeNumbers = new PrintPrimeNumbers();
         printPrimeNumbers.getInput();
        
    }
    
    
}

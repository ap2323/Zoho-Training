import java.util.Scanner;

//Fibonacci Series
class FibonacciSeries {
	
	int n1=0, n2= 1, n3, range; 
	//int start,end;
	Scanner scanner = new Scanner(System.in);
	
	void series() {
		
		
		
		for(int i=2; i<range; i++) {
			n3 = n1 + n2;
			//between range
			/*if(n3 >= start & n3 <= end) {
				
				System.out.print(n3 + " ");
				
			}*/
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
			
		}
		
	}
	
	void getInput(){
	
		System.out.println("Enter Range:");
		range = scanner.nextInt();
		
		if(range < 0) 
			System.out.println("Negative value cannot be accepted!");
			
		System.out.print(n1 + " " + n2 + " ");
		
		series();
		
	}
	
	public static void main(String[] args) {
		
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.getInput();
	}
	
}

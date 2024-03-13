import java.util.Scanner;

class MultiplicationTable {
	
	int number, limit;
	Scanner scanner = new Scanner(System.in);
	
	void mulTable() {
		
		for (int i=0; i<=limit; i++) {
			
			System.out.println(i + " * " +  number + " = " + (i * number));
		
		}
		
	}
	
	void getInput() {
		
		System.out.println("Enter number: ");
		number = scanner.nextInt();
		
		System.out.println("Enter limit: ");
		limit = scanner.nextInt();
		
		mulTable();
		
	}
	
	public static void main(String[] args) {
	
		MultiplicationTable multiplicationTable = new MultiplicationTable();
		multiplicationTable.getInput();
		
	}
	
}

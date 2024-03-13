import java.util.Scanner;

//get user input and print the value
class GetInputAndPrintInput {
	static String n = "";
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		
		System.out.println("Welcome! " + name + ", Have a nice day!");
		//System.out.println("Welcome! " + new Scanner(System.in).nextLine() + ", Have a nice day!"); // without using variable
		
	}
}

import java.util.Scanner;

//Age checking
class CheckAge {
	
	byte age;
	Scanner scanner = new Scanner(System.in);
	
	//validating the input
	void output(int age) {
	
		if (age < 0){
			System.out.println("Age cannot be negative!");
		} else if(age >= 18) {
			System.out.println("You are an adult!");
		} else {
			System.out.println("You are not an adult!");
		}
	}	
	
	//get input from user
	void getInput(){
		System.out.println("Enter your age:");
		age = scanner.nextByte();
		
		output(age);
	}
	
	public static void main(String[] args) {
		
		CheckAge checkAge = new CheckAge();
		checkAge.getInput();
	}
	
}

import java.util.Scanner;

//checks the number is positive or negative or zero
class CheckNumberPosOrNeg {
	
	int num;
	Scanner scanner = new Scanner(System.in);
	
	//validating the input
	void output(int num) {
	
		if(num==0) {
			System.out.println(num + " is a Zero!");
		} else if(num<0){
			System.out.println(num + " is a negative number!");
		} else {
			System.out.println(num + " is a postive number!");
		}
	}	
	
	//get input from user
	void getInput(){
		System.out.println("Enter number:");
		num = scanner.nextInt();
		
		output(num);
	}
	
	public static void main(String[] args) {
		
		CheckNumberPosOrNeg checkNumberPosOrNeg = new CheckNumberPosOrNeg();
		checkNumberPosOrNeg.getInput();
	}
	
}

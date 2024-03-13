import java.util.Scanner;
import java.util.Random;

//guess the number 1 - 100 
class GuessingNumber1To100 {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random(); 
	
	byte userInput, Attempts=1;
	int guessNumber;
	
	void guessingProcess(int userInput){
		//check the number within 100
		if( userInput > 100){
			System.out.println("Choose a number within a range!");
			getInput();
		} else if(userInput < 1) { //check the number is lesser than 1
			System.out.println("Choose a number within a range!");
			getInput();
		} else if( userInput == guessNumber ) { //check the number is correct
			System.out.println("You Guessed the Correct number : " + guessNumber);
			System.out.println("Number of Attempts taken: " + Attempts++);
			
			Options();
			
		} else if(userInput>guessNumber){
			if(Math.abs((userInput - guessNumber)) >= 1 & Math.abs((userInput - guessNumber)) <= 10){
				System.out.println("High!");
				Attempts++;
			
				getInput();
			}else if(Math.abs((userInput - guessNumber)) > 10){
				System.out.println("Too High!");
				Attempts++;
			
				getInput();
			} 
			
		} else if(userInput < guessNumber){
			if(Math.abs((userInput - guessNumber)) >= 1 & Math.abs((userInput - guessNumber)) <= 10 ){
				System.out.println("Low!");
				Attempts++;
			
				getInput();
			} else if(Math.abs((userInput - guessNumber)) > 10){
				System.out.println("Too Low!");
				Attempts++;
			
				getInput();
			} 
		
		} 
	}
	
	void getInput() {
	
		System.out.println("Choose the number between (1-100): ");
		userInput = scanner.nextByte();
		
		guessingProcess(userInput);
		
	}
	
	void Options() {
		
		guessNumber = random.nextInt(100);
		
		System.out.println("\n\t\t Guessing the number");
		System.out.println("1. Guess Number");
		System.out.println("2. Exit");
		System.out.println("Enter the Choice: ");
			
		byte choice = scanner.nextByte();
			
		switch(choice) {
				
			case 1:
				getInput();
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option!");
				Options();
				break;
		}
		
	}
	
	public static void main(String[] args) {
	
		GuessingNumber1To100 guessingNumber1To100 = new GuessingNumber1To100();
		guessingNumber1To100.Options();
		
	}
	
}
		
		
		
	
	
	

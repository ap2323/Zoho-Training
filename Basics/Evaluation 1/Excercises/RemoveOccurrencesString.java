import java.util.Scanner;

class RemoveOccurrencesString  {
	
	Scanner  scanner = new Scanner(System.in);
	String inputString; 
	char removeChar;
	
	private void removeOccurrence() {
		String result ="";
		result = inputString.replace(Character.toString(removeChar).toUpperCase(), "");
		System.out.println("After Remove: " + (result.replace(Character.toString(removeChar).toLowerCase(), "")));
		
	}
	
	private void getInput() {
		System.out.println("Enter String: ");
		inputString = scanner.nextLine();
		
		System.out.println("Enter char to remove: ");
		removeChar = scanner.next().charAt(0);
		
		removeOccurrence();
		
		
	}
	
	public static void main(String[] args) {
		RemoveOccurrencesString removeOccurrenceString = new RemoveOccurrencesString();
		removeOccurrenceString.getInput();
	}
}
		
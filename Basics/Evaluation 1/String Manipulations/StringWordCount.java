import java.util.*;

class StringWordCount {
	String str;
	String[] getWords;
	Scanner scanner = new Scanner(System.in);
	
	void findWordCount() {
		
		getWords = str.trim().split("\\s+");
		
		System.out.println("No. of words: " + getWords.length);
		
	}
	
	void getInput(){
		
		
		System.out.println("Enter the String:");
		str = scanner.nextLine();

		getWords = new String[str.length() - str.length()/2];
		findWordCount();
		
	}
	
	public static void main(String[] args){
		
		StringWordCount stringWordCount = new StringWordCount();
		stringWordCount.getInput();
		
	}
	
}

import java.util.Scanner;

class StringFrequentLetter {
	String str;
	Scanner scanner = new Scanner(System.in);
	
	void findFrequentLetter() {
		int frequent = 0;
		int maxFrequent = 0;
		char currentChar =' ';
		for(int i=0; i<str.length()-1; i++) {
			frequent = 0;
			for(int j =0; j<str.length()-1; j++) {
				if( str.charAt(i) == str.charAt(j)) {
					frequent++;
				} 
				
			}
			if(frequent > maxFrequent) {
				maxFrequent = frequent;
				currentChar = str.charAt(i);
			}
			
		}
			
	
		System.out.println("Frequent Letter: " + currentChar);	
	}
		
	
	void getInput(){
		
		
		System.out.println("Enter the String:");
		str = scanner.nextLine();
		
		str = str.replace(" ","");
		
		findFrequentLetter();
		
	}
	
	public static void main(String[] args){
		
		StringFrequentLetter stringFrequentLetter = new StringFrequentLetter();
		stringFrequentLetter.getInput();
		
	}
	
}
	

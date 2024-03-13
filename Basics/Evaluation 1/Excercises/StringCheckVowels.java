import java.util.Scanner;

//Check vowel in a String
class StringCheckVowels{
	
	String str;
	Scanner scanner = new Scanner(System.in);
	
	void checkVowel() {
		
		for(int i=0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				if(ch=='A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' ||
					ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
					
					System.out.println("True");
					break;
				} else if(i == (str.length()-1)) {
					System.out.println("False");
					break;
				} else {
					continue;
				}
			
			} else {
			
				continue;
				
			}
				
		}
		
	}
	
	void getInput(){
		
		System.out.println("Enter String: ");
		str = scanner.nextLine();
		
		checkVowel();
	}
	
	public static void main(String[] args) {
		
		StringCheckVowels stringCheckVowels = new StringCheckVowels();
		stringCheckVowels.getInput();
		
	}
	
}

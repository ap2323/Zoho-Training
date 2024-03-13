import java.util.Scanner;

class StringNonRepeatedLetter {
	String str;
	Scanner scanner = new Scanner(System.in);
	
	void findNonRepeated() {
		char ch=' ';
		int index = -1;
		for(char i : str.toCharArray()) {
			if(str.indexOf(i) == str.lastIndexOf(i)) {
				ch = i;
				break;
			} else {
				index += 1;
			}
		}
		if(index == str.length()-1){
			System.out.println("All characters are repeated.");
		} else {
			System.out.println("First non repeated letter is: "+ ch);
		}
		
	}
		
	
	void getInput(){
		
		
		System.out.println("Enter the String:");
		str = scanner.nextLine();
		
		str = str.replace(" ","");
		
		findNonRepeated();
		
	}
	
	public static void main(String[] args){
		
		StringNonRepeatedLetter stringNonRepeatedLetter = new StringNonRepeatedLetter();
		stringNonRepeatedLetter.getInput();
		
	}
	
}
	

import java.util.Scanner;

//PalindromeSpaceChecking
class StringPalindrome {

	Scanner scanner = new Scanner(System.in);
	String str;
	
	void checkString(String str) {
		String str2 = "";
		if(!str.isEmpty()){
			//remove whitspace from string
			for (int i=0; i<str.length(); i++){
				if(!(str.charAt(i) == ' ')){
					str2 += Character.toString(str.charAt(i));
				}
			}
			
			str = str2;
			str2 ="";
			
			//Using StringBuilder 
			/*StringBuilder strBuilder = new StringBuilder(str);
			
			if(str.equals(strBuilder.reverse().toString())){
				System.out.println("The String is palindrome");
			} else {
				System.out.println("The String is not palindrome");
			}*/
			
			
			// Using for-loop
			for (int i=str.length()-1; i>=0; i--){
				
				str2 += Character.toString(str.charAt(i));
			}
			if(str.equals(str2)){
				System.out.println("The String is palindrome");
			} else {
				System.out.println("The String is not palindrome");
			}
		} else {
			System.out.println("The String is Empty!");
		}
	}
	
	void getInput(){
		
		System.out.println("Enter the String: ");
		str = scanner.nextLine();
		
		checkString(str);
		
	}
	
	public static void main(String[] args) {
		
		StringPalindrome stringPalindrome = new StringPalindrome();
		stringPalindrome.getInput();
		
	}
}

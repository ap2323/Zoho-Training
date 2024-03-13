import java.util.Scanner;

class StringCapitalizeWord {
	String str;
	Scanner scanner = new Scanner(System.in);
	
	void capitalize() {
		String result = "";
		boolean isCapitalize= false;
		if(!str.isEmpty()){
			System.out.println(str);
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == ' '){
					isCapitalize = true;
					result += Character.toString(str.charAt(i));
					
				}else if(isCapitalize){
					result += " "+Character.toString(str.charAt(i)).toUpperCase();
					isCapitalize = false;
				} else {
					result += Character.toString(str.charAt(i));
				}
			
			}
			System.out.println("After Capitalize: " + result);
		} else {
			System.out.println("String is Empty!");
		}

	}
		
	
	void getInput(){
		
		
		System.out.println("Enter the String:");
		str = scanner.nextLine();
		
		capitalize();
		
	}
	
	public static void main(String[] args){
		
		StringCapitalizeWord stringCapitalizeWord = new StringCapitalizeWord();
		stringCapitalizeWord.getInput();
		
	}
	
}
	

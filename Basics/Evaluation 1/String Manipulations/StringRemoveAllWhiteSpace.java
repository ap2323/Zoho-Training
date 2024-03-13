import java.util.Scanner;

class StringRemoveAllWhiteSpace {
	String str;
	Scanner scanner = new Scanner(System.in);
	
	void removeWhiteSpace() {
		String result = "";
		if(!str.isEmpty()){
			for(int i=0; i<str.length(); i++) {
				if(!(str.charAt(i) == ' ')){
					result += Character.toString(str.charAt(i));
				}
			
			}
			System.out.println("After Removed: " + result);
		} else {
			System.out.println("String is Empty!");
		}

	}
		
	
	void getInput(){
		
		
		System.out.println("Enter the String:");
		str = scanner.nextLine();
		
		removeWhiteSpace();
		
	}
	
	public static void main(String[] args){
		
		StringRemoveAllWhiteSpace stringRemoveAllWhiteSpace = new StringRemoveAllWhiteSpace();
		stringRemoveAllWhiteSpace.getInput();
		
	}
	
}
	

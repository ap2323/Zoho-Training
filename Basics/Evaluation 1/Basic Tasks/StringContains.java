import java.util.Scanner;

//Checks the String contains Java
class StringContains {

	Scanner scanner = new Scanner(System.in);
	String str;
	
	void checkString(String str) {
		if(!str.isEmpty()){
			if(str.contains("Java")){
				System.out.println("The String contains Java.");
			} else {
				System.out.println("The String does not contains Java.");
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
		
		StringContains stringContains = new StringContains();
		stringContains.getInput();
		
	}
}

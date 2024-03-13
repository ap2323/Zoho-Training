import java.util.Scanner;

//Reverse the String
class ReverseStringWithoutInBuild {

	Scanner scanner = new Scanner(System.in);
	String str, revStr="";
	
	void revString(char[] ch) {
		if(!str.isEmpty()){
			
			//for-loop method
			for(int i=(ch.length-1); i>=0; i--){
				revStr += Character.toString(ch[i]);
			}
			System.out.println(revStr);
			
		} else {
			System.out.println("The String is Empty!");
		}
	}
	
	void getInput(){
		
		System.out.println("Enter the String: ");
		str = scanner.nextLine();
		
		char ch[] = str.toCharArray();
		
		revString(ch);
		
	}
	
	public static void main(String[] args) {
		
		ReverseStringWithoutInBuild reverseStringWithoutInBuild = new ReverseStringWithoutInBuild();
		reverseStringWithoutInBuild.getInput();
		
	}
}

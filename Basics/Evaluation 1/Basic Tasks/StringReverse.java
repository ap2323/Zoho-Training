import java.util.Scanner;

//Reverse the String
class StringReverse{

	Scanner scanner = new Scanner(System.in);
	String str, revStr="";
	
	void revString(String str) {
		if(!str.isEmpty()){
			//for-loop method
			for(int i=(str.length()-1); i>=0; i--){
				revStr += Character.toString(str.charAt(i));
			}
			System.out.println(revStr);
			
			//String Builder Method
			/*StringBuilder stringBuilder = new StringBuilder(str);
			System.out.println(stringBuilder.reverse());*/
		} else {
			System.out.println("The String is Empty!");
		}
	}
	
	void getInput(){
		
		System.out.println("Enter the String: ");
		str = scanner.nextLine();
		
		revString(str);
		
	}
	
	public static void main(String[] args) {
		
		StringReverse stringReverse = new StringReverse();
		stringReverse.getInput();
		
	}
}

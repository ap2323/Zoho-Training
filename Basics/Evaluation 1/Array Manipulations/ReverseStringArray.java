import java.util.Scanner;
import java.util.Arrays;
//Reverse the StringArray
class ReverseStringArray {

	Scanner scanner = new Scanner(System.in);
	String[] str;
	String[] revStr;
	int size;
	
	void revStringArray(String[] str) {
			
			int index =0;
			String temp="";
			for(int i=str.length-1; i>=0; i--){
				
				//temp = str[i];
				revStr[index++] = str[i].toString();
			}
			System.out.println(Arrays.toString(revStr));
			
		
		
	}
	
	void getInput(){
		
		System.out.println("Enter the Size: ");
		size = scanner.nextInt();
		
		str = new String[size];
		revStr = new String[size];
		scanner.nextLine();
		System.out.println("Enter the Strings: ");
		
		for(int i =0; i<size; i++) {
			str[i] = scanner.nextLine();
		}
		 
		
		revStringArray(str);
		
	}
	
	public static void main(String[] args) {
		
		ReverseStringArray reverseStringArray = new ReverseStringArray();
		reverseStringArray.getInput();
		
	}
}

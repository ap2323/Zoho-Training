//import java.util.Scanner;
//import java.util.Arrays;
import java.util.*;

class StringLargestSubString {
	String str;
	Scanner scanner = new Scanner(System.in);
	
	void findLargestSubArray() {
		int maxLength = 0;
		int startIndex=0, endIndex=0;
		while( endIndex < str.length()) {
			for(int i=startIndex; i<endIndex; i++) {
				
				if( Character.toLowerCase(str.charAt(endIndex)) == Character.toLowerCase(str.charAt(i))) {
					startIndex = i + 1;
					break;
				} 
				
			}
			maxLength = Math.max(maxLength, endIndex - startIndex + 1);
			endIndex++;
			
		}
		System.out.println("Length is: " + maxLength);	
		
	}
	
	void getInput(){
		
		
		System.out.println("Enter the String:");
		str = scanner.nextLine();
		
		
		System.out.println("String is: " + str);
	
		findLargestSubArray();
		
	}
	
	public static void main(String[] args){
		
		StringLargestSubString stringLargestSubString = new StringLargestSubString();
		stringLargestSubString.getInput();
		
	}
	
}
	

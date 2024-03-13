import java.util.Scanner;
import java.util.Arrays;

class StringAnagram {
	String str, str2;
	Scanner scanner = new Scanner(System.in);
	
	void checkAnagram() {
		
			
		if(str.length() != str2.length()){
			
			System.out.println("The given strings are not an anagram!");
		} else {
			
			char[] ch1 = str.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			char temp=' ';
			for(int i=0; i<str.length();i++) {
				for(int j=(i+1);j<str.length(); j++) {
					if(ch1[i] > ch1[j]) {
					 	temp = ch1[j];
					 	ch1[j] = ch1[i];
					 	ch1[i] = temp;
					 	
					 }
					 
					 if(ch2[i] > ch2[j]) {
					 	temp = ch2[j];
					 	ch2[j] = ch2[i];
					 	ch2[i] = temp;
					 	
					 }
				}
			}
			
			if(Arrays.equals(ch1,ch2)) {
				System.out.println("The given strings are an anagram!");
			} else {
				
				System.out.println("The given strings are not an anagram!");
			}
		}
	}
		
	
	void getInput(){
		
		
		System.out.println("Enter the String:");
		str = scanner.nextLine();
		
		str = str.replace(" ", "");
		
		System.out.println("Enter the Another String:");
		str2 = scanner.nextLine();
		
		str2 = str2.replace(" ", "");
		
		checkAnagram();
		
	}
	
	public static void main(String[] args){
		
		StringAnagram stringAnagram  = new StringAnagram();
		stringAnagram.getInput();
		
	}
	
}
	

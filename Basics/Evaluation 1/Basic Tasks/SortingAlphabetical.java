import java.util.Scanner;
import java.util.Arrays;

//Sorting in alphabetical
class SortingAlphabetical{
	
	String[] orgArray;
	
	Scanner scanner = new Scanner(System.in);
	
	void sorting() {
		
		String temp;
		for(int i = 0; i<orgArray.length; i++) {
			
			for(int j = 1; j<orgArray.length-i; j++) {
				int pos=0;
				while((pos < orgArray[j].length() && pos < orgArray[j-1].length()) &&
				Character.toLowerCase(orgArray[j].charAt(pos)) == Character.toLowerCase(orgArray[j-1].charAt(pos)) ) {
					
					pos++;
					
					
				}
				if((pos < orgArray[j].length() && pos < orgArray[j-1].length()) &&
				Character.toLowerCase(orgArray[j].charAt(pos)) < Character.toLowerCase(orgArray[j-1].charAt(pos)) ) {
					temp = orgArray[j-1];
					
					orgArray[j-1] = orgArray[j];
					orgArray[j] = temp;
				}
				
				
			}
			
		}
		
		System.out.println(Arrays.toString(orgArray));
		
	}
	
	void getInput(){
		
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		
		orgArray = new String[size];
		
		scanner.nextLine();
		System.out.println("Enter the string elements:");
		for (int i=0; i<size; i++){
			orgArray[i] = scanner.nextLine();
		}
		//Arrays.sort(orgArray);
		//System.out.println(Arrays.toString(orgArray));
		
	}
	
	public static void main(String[] args){
		
		SortingAlphabetical sortingAlphabetical = new SortingAlphabetical();
		sortingAlphabetical.getInput();
		sortingAlphabetical.sorting();
		
	}
	
}
				

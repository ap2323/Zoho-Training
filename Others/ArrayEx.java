import java.util.Scanner;
import java.util.Arrays;

public class ArrayEx{

	static int[] oneDArray ={};
	static int[][] twoDArray = {};
	int choice,size,rowSize,colnSize,rowIndex,colnIndex;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){

				
		new ArrayEx().Options();
		
		
	}
	
	void Options() {
		while(true) {
			System.out.println("\n1. 1-D Array");
			System.out.println("2. 2-D Array");
			System.out.println("3. Exit");
			System.out.println("Enter Choice:");
			int choice = scanner.nextInt();
		
			switch(choice) {
				case 1 :
					new ArrayEx().option1();
					break;
				case 2 :
					new ArrayEx().option2();
					break;
				case 3 :
					System.exit(0);
					break;
				default :
					System.out.println("Invalid Option!");
					break;
			}
		}
	}
	
	void option1() {
		System.out.println("\n1. Add Element");
		System.out.println("2. Remove Element");
		System.out.println("3. Back");
		System.out.println("Enter Choice:");
		choice = scanner.nextInt();
		switch(choice) {		
		case 1:
			System.out.println("Enter Size of an Array: ");
			size = scanner.nextInt();
			oneDArray = new int[size];
			new ArrayEx().singleDimensionAdd(size);
			break;
						
		case 2:
			if(oneDArray.length == 0) {
				System.out.println("Empty Array cannot be accessed!");
			} else {
			System.out.println("\nEnter index to remove: ");
			int index = scanner.nextInt();
			System.out.println("After removed: " + Arrays.toString(new ArrayEx().oneDRemoveElement(oneDArray,index)));
			}
			break;
			
		case 3:
			new ArrayEx().Options();
			break;
		}
		
	}
	
	void option2() {
		System.out.println("\n1. Add Element");
		System.out.println("2. Remove Element");
		System.out.println("3. Back");
		System.out.println("Enter Choice:");
		choice = scanner.nextInt();
		switch(choice) {	
		case 1:
			System.out.println("Enter No. of Rows: ");
			rowSize = scanner.nextInt();
			System.out.println("Enter No. of Columns: ");
			colnSize = scanner.nextInt();
			twoDArray = new int[rowSize][colnSize];
			new ArrayEx().twoDimensionAdd(rowSize, colnSize);
			
			break;
						
		case 2:
			if(twoDArray.length == 0) {
				System.out.println("Empty array cannot be Accessed!");
			} else {
			System.out.println("Enter Row Index: ");
			rowIndex = scanner.nextInt();
			System.out.println("Enter Column Index: ");
			colnIndex = scanner.nextInt();
			
			new ArrayEx().twoDRemoveElement(twoDArray, rowIndex, colnIndex);
			}
			break;
		case 3:
			new ArrayEx().Options();
			break;
		}
		
	}
	//1-D
	void singleDimensionAdd(int size){
		
		for(int i=0; i<size; i++){
			System.out.println("Enter num " + (i+1) + ": ");
			oneDArray[i] = scanner.nextInt();

		}
		System.out.println("Array is: ");
		for(int j=0; j<size; j++){
			System.out.println(oneDArray[j]);
		}
		
		new ArrayEx().option1();
	}
	
	//2-D
	void twoDimensionAdd(int rowSize, int colnSize){
		System.out.println("Give Input");
		for(int i=0; i<rowSize; i++){
			for(int j=0; j<colnSize; j++){
				
				twoDArray[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Array is :");
		for(int i=0; i<rowSize; i++){
			for(int j=0; j<colnSize; j++){
				
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}
		
		new ArrayEx().option2();
	}
	//Remove
	
	int[] oneDRemoveElement(int[] orgArr, int index){
		
		int[] dupArray = new int[size];
		
		for(int i=0, j=0; i<orgArr.length; i++){
			if(i==index) {
				continue;
			}
			
			dupArray[j++] = orgArr[i];
			
		}
		
		return dupArray;
		
		
	}	
	
	void twoDRemoveElement(int[][] orgArr, int row, int column){
		
		int[][] dupArray = new int[rowSize][colnSize];
		dupArray = Arrays.copyOf(orgArr, orgArr.length);
		
		for(int i=0; i<orgArr.length; i++){
			for(int j=0; j<orgArr.length; j++){
			
				if(i==row & j==column) {
					
					dupArray[i][j] = 0;
					
				} else {
				dupArray[i][j] = orgArr[i][j];
				}
			}
			
		
			
		}
		
		for(int i=0; i<orgArr.length; i++){
			for(int j=0; j<orgArr.length; j++){
				System.out.print(dupArray[i][j] + " ");
				
				}
			System.out.println();
			}
			
		
		
	}
	
}


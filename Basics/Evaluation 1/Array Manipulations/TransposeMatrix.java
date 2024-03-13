import java.util.Scanner;

class TransposeMatrix {
	
	int row,coln;
	int[][] matrix;
	int[][] tranpose_matrix;
	
	Scanner scanner = new Scanner(System.in);
	
	void tranpose(){
		
		for(int i=0; i<row; i++){
			for(int j=0; j<coln; j++) {
				
				tranpose_matrix[j][i] = matrix[i][j];
				
			}
			
		}
		System.out.println("\nTranspose Matrix: ");
		for(int i=0; i<coln; i++) {
			for(int j=0; j<row; j++){
				
				System.out.print(tranpose_matrix[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}
	
	void getInput() {
	
		System.out.println("Enter row size: ");
		row = scanner.nextInt();
		
		System.out.println("Enter column size: ");
		coln = scanner.nextInt();
		
		matrix = new int[row][coln]; //row coln
		tranpose_matrix = new int[coln][row]; //coln to row , row to coln
		
		System.out.println("Enter elements: ");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<coln; j++){
				
				matrix[i][j] = scanner.nextInt();
				
			}
			
		}
		System.out.println("Matrix: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<coln; j++){
				
				System.out.print(matrix[i][j] + " ");
				
			}
			System.out.println();
		}
		
		tranpose();
	}
	
	public static void main(String[] args){
		
		TransposeMatrix tranposeMatrix = new TransposeMatrix();
		tranposeMatrix.getInput();
		
	}
	
}

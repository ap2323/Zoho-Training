class SumOfMatrices {
	
	int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
	int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
	
	void sum() {
		int len1 = Math.max(matrix1.length, matrix2.length);
		int len2 = Math.min(matrix1.length, matrix2.length);
		for(int i=0; i<len1; i++) {
			for(int j=0; j<len2; j++){
				
				matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
				
			}
		}
		
		for(int i=0; i<len1; i++) {
			for(int j=0; j<len2; j++){
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	
	public static void main(String[] args){
		
		SumOfMatrices sumOfMatrices = new SumOfMatrices();
		sumOfMatrices.sum();
		
	}
	
}
	

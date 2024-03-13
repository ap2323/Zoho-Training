class Summa {
	static int[][] firstArray = { {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
	
	public static void main(String[] args) {
		
		for(int row=0; row<firstArray.length; row++) {
			for(int coln=0; coln<firstArray.length; coln++){
				System.out.print(firstArray[row][coln] + " ");
			}
			System.out.println();
		}
	}
}

class BreakReturn {
	public static int isDivide(int number1, int number2){
		if(number2 == 0){
			System.out.println("Error");
			return -1;
		}
		return number1/number2;
	}
	
	public static void main(String[] args){
		int number1 = 10;
		int number2 = 0;
		System.out.println("Ans: "+ isDivide(number1, number2));
	}
}

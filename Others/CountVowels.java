class CountVowels {
	public static void main(String[] args) {
		String str = "12o34";
		int count =0;
		for(int i=0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				if(ch=='A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' ||
					ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
					
					count++;
				} 
			
			}else {
			
				continue;
				
			}	
		}
		
		System.out.println("Total no. of Vowels: " + count);
		
	}
	
}

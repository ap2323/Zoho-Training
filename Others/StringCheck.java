class StringCheck {
	
	String s1 = "Arun";
	
	
	//String s1 = "Prakash";
	
	
	public char charAt(String value, int index){    
       	char[] array = value.toCharArray();   
       	 try {
       	 	return array[index];
		} catch (ArrayIndexOutOfBoundsException ex) {
           		throw new StringIndexOutOfBoundsException(index);    
       	}    
       	//return value[index];    
   	}
	// internal of charAt();
	/*public char charAt(int index) {    
       	if ((index < 0) || (index >= value.length)) {    
           		throw new StringIndexOutOfBoundsException(index);    
       	}    
       	return value[index];    
   	} */ 
	void check() {
		
		System.out.println(charAt(s1,9));
		
	}
	
	public static void main(String[] args) {
		
		new StringCheck().check();
		
	}
	
}
	

class MoveZeroElement { 
	
	static void moveZerosToEnd(int arr[], int n) 
	{ 
		int count = 0; 
		for (int i = 0; i < n; i++) 
			if (arr[i] != 0) 
				arr[count++] = arr[i]; 
		while (count < n) 
			arr[count++] = 0; 
	}
	public static void main (String[] args) 
	{ 
		int arr[] = {1,0,2,0,3,0,4,0}; 
		int n = arr.length; 
		moveZerosToEnd(arr, n); 
		System.out.println("After Move: "); 
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" "); 
	} 
} 



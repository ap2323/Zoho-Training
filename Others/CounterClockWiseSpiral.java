import java.io.*;

class CounterClockWiseSpiral
{
	static int R = 4;
	static int C = 4;

	private void print(int m, int n, int arr[][])
	{
		int i, k = 0, l = 0;

		/* k - starting row index
		m - ending row index
		l - starting column index
		n - ending column index */

		int count = 0;

		int total = m * n;

		while (k < m && l < n) 
		{
			if (count == total)
				break;

			// Print the first column from the remaining columns
			for (i = k; i < m; ++i)
			{
				System.out.print(arr[i][l] + " ");
				count++;
			}
			l++;
			
			if (count == total)
				break;

			// Print the last row from the remaining rows 
			for (i = l; i < n; ++i) 
			{
				System.out.print(arr[m - 1][i] + " ");
				count++;
			}
			m--;
			
			if (count == total)
				break;

			// Print the last column from the remaining columns 
			if (k < m) 
			{
				for (i = m - 1; i >= k; --i) 
				{
					System.out.print(arr[i][n - 1] + " ");
					count++;
				}
				n--;
			}
			
			if (count == total)
				break;

			// Print the first row from the remaining rows
			if (l < n) 
			{
				for (i = n - 1; i >= l; --i) 
				{
					System.out.print(arr[k][i] + " ");
					count++;
				}
				k++;
				
			}
		}
	}


	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
	
		CounterClockWiseSpiral counterClockWiseSpiral = new CounterClockWiseSpiral();
		counterClockWiseSpiral.print(R, C, arr);
		
	}
}



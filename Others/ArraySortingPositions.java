import java.util.*;
class ArraySortingPositions
{
    
    public void sortIt(int arr[], int n)
    {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        
        // even numbers
        for(int i = 0; i < n; i++)
        {
          if(arr[i] % 2 == 0)
             {
                 A.add(arr[i]);
             }
          else
            {
                B.add(arr[i]);
            }
        }
        
        Collections.sort(A);//even asc
        Collections.sort(B, Collections.reverseOrder());// odd desc
        int j, k;
        for( j = 0; j < B.size(); j++)
         {
            arr[j] = B.get(j);
         }
        for( k = B.size(); k < n; k++)
         {
            
            arr[k] = A.get(k - B.size());
            
         }
      System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
    int[] arr = {0, 4, 5, 3, 7, 2, 1};
    int n = arr.length;
    ArraySortingPositions arraySortingPositions = new ArraySortingPositions();
    arraySortingPositions.sortIt(arr, n);
    }
    
}

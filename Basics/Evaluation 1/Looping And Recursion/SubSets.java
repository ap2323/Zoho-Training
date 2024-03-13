import java.util.*;

public class SubSets {
	int[] arr = {1,2,3};
	int n = arr.length;
		
	void printSubSets() {
		List<List<Integer>> result = pass(arr, n , 0, new ArrayList<>(), new ArrayList<>());
		System.out.println(result);
	}
		
	public List<List<Integer>> pass(int[] arr, int n, int index, List<Integer> currentSubSet, List<List<Integer>> result){
	    if(index == n){
	        result.add(new ArrayList<>(currentSubSet));
	        return result;
	    }
	    
	    currentSubSet.add(arr[index]);
	     pass(arr, n, index + 1, currentSubSet, result);
	     
	    currentSubSet.remove(currentSubSet.size() - 1);
	    pass(arr, n, index + 1, currentSubSet, result);
	    
	    return result;
	}
	
	public static void main(String[] args) {
		
		SubSets subSets = new SubSets();
		subSets.printSubSets();
		
	}
	
}

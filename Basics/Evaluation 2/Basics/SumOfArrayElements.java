import java.util.Scanner;

class SumOfArrayElements {
          
             int[] array;
             int array_size;
             int total;
             
             Scanner scanner = new Scanner(System.in);
             
             private void sum() {
                       for(int startIndex=0; startIndex < array.length;startIndex++){
                       	total += array[startIndex];
                       }
                       
                       System.out.println("Sum of Array is: "+ total);
              }
              
              private void getInput() {
	
			System.out.println("Enter size of Numeric array: ");
			array_size = scanner.nextInt();
		
			array = new int[array_size];
		
			System.out.println("Enter the elements of numeric Array:");
		
			for(int i=0; i<array_size; i++) {
				array[i] = scanner.nextInt();
			}
		}
              
              public static void main(String[] args) {
              		SumOfArrayElements sumOfArrayElements = new SumOfArrayElements();
              		sumOfArrayElements.getInput();
                       sumOfArrayElements.sum();
              }
   }

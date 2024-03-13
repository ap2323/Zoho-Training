class SumOfArrayElements {
          
             int[] array = {1,2,3,4,5,6};
             int total;
             private void sum() {
                       for(int startIndex=0; startIndex < array.length;startIndex++){
                       	total += array[startIndex];
                       }
                       
                       System.out.println("Sum of Array is: "+ total);
              }
              
              public static void main(String[] args) {
                           SumOfArrayElements sumOfArrayElements = new SumOfArrayElements();
                           sumOfArrayElements.sum();
              }
   }

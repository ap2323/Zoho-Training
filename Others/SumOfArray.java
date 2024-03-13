import java.util.Scanner;

class SumOfArray {
             short target;
             Scanner scanner = new Scanner(System.in);
             int[] array = {1,2,3,4,5,6};
             private void sum() {
                       for(int startIndex=0; startIndex < array.length;startIndex++){
                              for(int nextIndex=0; nextIndex < array.length;nextIndex++){
                                         if(array[startIndex] + array[nextIndex] == target) {
                                                 System.out.println(array[startIndex] + " "+array[nextIndex]);
                                         }
                              }
                        }
              }
              private void getInput() {
                    System.out.println("Enter target: ");
                    target = scanner.nextShort();
              }
              public static void main(String[] args) {
                           SumOfArray sumOfArray = new SumOfArray();
                           sumOfArray.getInput();
                           sumOfArray.sum();
              }
   }

import java.util.Scanner;

public class NthPerfectNumber {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter thr number ");
        int num = in.nextInt(); 
        
        int nthPerfectNumber = findNthPerfectNumber(num);
        System.out.println("The " + num + "th perfect number is: " + nthPerfectNumber);
    }

    static int findNthPerfectNumber(int n) {
        int count = 0;
        int num = 0;

        while (count < n) {
            num++;

            if (sumOfDigitsEqualsTen(num)) {
                count++;
            }
        }

        return num;
    }

    private static boolean sumOfDigitsEqualsTen(int num) {
        int digitSum = 0;

        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }

        return digitSum == 10;
    }
}

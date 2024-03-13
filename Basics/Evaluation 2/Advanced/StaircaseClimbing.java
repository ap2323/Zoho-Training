import java.util.Arrays;

public class StaircaseClimbing {
    public static int countWays(int n, int[] steps) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int step : steps) {
                if (i - step >= 0) {
                    dp[i] += dp[i - step];
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5; // Number of steps
        int[] steps = {1, 3, 5}; // Set of allowed steps

        int ways = countWays(n, steps);
        System.out.println("Number of unique ways to climb the staircase with " + n + " steps: " + ways);
    }
}

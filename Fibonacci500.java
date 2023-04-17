
/* Mayank Kumar
 *
 * Import the BigInteger class from the java.math package. which can store very large int
 * Define an array of BigInteger objects named dp, which will store the values of the Fibonacci series up to n.
 * Initialize dp[0] to BigInteger.ZERO and dp[1] to BigInteger.ONE, since these are the first two values of the Fibonacci series.
* Use a loop to compute the remaining values of the Fibonacci series up to n.
* For each value i from 2 to n, compute dp[i] by adding dp[i-1] and dp[i-2].
 */
import java.math.BigInteger;
public class Fibonacci500 {
    public static void main(String[] args) {
        int n = 500;
        BigInteger[] dp = new BigInteger[n + 1];
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }
        for (int i = 0; i <= n; i++) {
            System.out.println("Fibonacci(" + i + ") = " + dp[i]);
        }
    }
}

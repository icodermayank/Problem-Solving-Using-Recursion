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

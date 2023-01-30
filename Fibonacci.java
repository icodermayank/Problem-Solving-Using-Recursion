/* By : Mayank Kumar
 * The program calculates the nth Fibonacci number using dynamic programming.
The program has a fib() method that takes an integer argument n.
The fib() method uses the formula fib(n) = fib(n-1) + fib(n-2) to calculate the nth Fibonacci number.
The fib() method uses an array dp to store intermediate results to avoid repeating calculations.
The main function takes in an integer argument n and calls the fib() method with n, then prints the result.
The fib() method first checks if the value of dp[n] is not 0.
If dp[n] is not 0, the fib() method returns dp[n] as the nth Fibonacci number has already been calculated.
If dp[n] is 0, the fib() method checks if n is 0 or 1.
If n is 0, the fib() method returns 0. If n is 1, the fib() method returns 1.
If n is neither 0 nor 1, the fib() method calculates fib(n) = fib(n-1) + fib(n-2).
The result of fib(n) is stored in dp[n] for later use.
*/

//Constraints: 0 <= n <= 30

class Fibonacci{
    public static void main(String [] args){
        int n = 24;
        System.out.println(fib(n));
    }

    
    static int fib(int n){
        
        int dp[] = new int[31];

        while(dp[n]!=0){
            return dp[n];
        }

        if(n==0) return 0;
        if(n==1) return 1;
    return dp[n] = fib(n-1)+fib(n-2);
    }
}
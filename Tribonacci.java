/*
 * 
 * The program calculates the nth Tribonacci number using dynamic programming.
The program has a tribonacci() method that takes an integer argument n.
The tribonacci() method uses the formula tribonacci(n) = tribonacci(n-1) + tribonacci(n-2)+ tribonacci(n-3) to calculate the nth tribonacci number.
The tribonacci() method uses an array dp to store intermediate results to avoid repeating calculations.
The main function takes in an integer argument n and calls the tribonacci() method with n, then prints the result.
The tribonacci() method first checks if the value of dp[n] is not 0.
If dp[n] is not 0, the tribonacci() method returns dp[n] as the nth Tribonacci number has already been calculated.
If dp[n] is 0, the tribonacci() method checks if n is 0 , 1 or 2
If n is 0, the tribonacci(n) method returns 0. If n is 1, the tribonacci() method returns 1. if 2 then returns 1
If n is neither 0 nor 1, the tribonacci() method calculates tribonacci(n) = tribonacci(n-1) + tribonacci(n-2)+ tribonacci(n-3)
The result of tribonacci(n) is stored in dp[n] for later use.
*/
//Constraints: 0 <= n <= 30

class Tribonacci{
    public static void main(String [] args){
        int n = 15;
        System.out.println(tribonacci(n));

    }
    static int tribonacci(int n){
        int [] dp = new int [31];

        while(dp[n] !=0){
            return dp[n];
        }
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;

        return dp [n] =tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
}
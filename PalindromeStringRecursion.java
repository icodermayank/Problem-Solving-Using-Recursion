/*
 * By: Mayank Kumar
 * Problem: checking the given String is either palindrome or not.
 * logic:
 * first initilize the two variable l and r which will point the leftmost and rightmost character of the string
 * for best case if l >= r means string is palindrome and return true
 * if charAt l != charAt r then return false;
 * recursivly check for l+1 and r-1,
*/


class PalindromeStringRecursion{
    public static void main(String [] args){
        String s = "racecar";

        int l =0;
        int r = s.length()-1;

        System.out.println(isPalindrome(s, l, r));

    }

    static boolean isPalindrome(String s, int l, int r){
        // for best case.
        if(l>=r){
            return true;
        }
        
        // return false if characters not matched.
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        // recursivly call.. for rest characters
        return isPalindrome(s, l+1, r-1);

    }
}
/*
 * Problem : Find Minimum Element in Non empty array using recursion 
 * By : Mayank Kumar
 * logic:
 * if length of the array is 1 then simply return the last element of the array.
 * otherwise recursivly return the minimum of the
 * last element and rest of the element in the array.
 * 
*/


class MinEleArrayRecursion{
    public static void main(String [] args){
        int a []= {12,4,5,7,9,10,2,6,11};

        // calling the minimum mehtod..
        System.out.println(minimum(a, a.length));
    }

    static int  minimum(int a[], int len){
        int min;
        // if length is 1 then simply return the last element.
        if(len == 1){
            return a[0];
        }
        else {
            // recursivly find the minimum element from rest of the element.
            return Math.min(a[len-1], minimum(a, len-1));
        }
    }
}
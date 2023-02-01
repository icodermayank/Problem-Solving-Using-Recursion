/*
 * Problem : Find Maximum Element in Non empty array using recursion 
 * By : Mayank Kumar
 * logic:
 * if length of the array is 1 then simply return the last element of the array.
 * otherwise recursivly return the maximum of the
 * last element and rest of the element in the array.
 * 
*/


class MaxEleArrayRecursion{
    public static void main(String [] args){
        int a []= {12,4,5,7,9,10,2,6,11};

        // calling the maximum mehtod..
        System.out.println(maximum(a, a.length));
    }

    static int  maximum(int a[], int len){
        int max;
        // if length is 1 then simply return the last element.
        if(len == 1){
            return a[0];
        }
        else {
            // recursivly find the maximum element from rest of the element.
            return Math.max(a[len-1], maximum(a, len-1));
        }
    }
}
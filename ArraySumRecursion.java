/*
 * BY:- MAYANK KUMAR
 * Program to find the sum of the array using recursion.
 * Logic--
 * create the method sum which will take two arguments array and index.
 * for best case if index == length of the array then simply retun true
 * other wise add the first element + recursivly call the sum method for rest element.
*/
class ArraySumRecursion{
    public static void main(String [] args){
        int a [] = {3,5,6,7,8,2,1,6,-9};

        System.out.println(sum(a,0));
    }
    static int sum(int a[], int index){
        // for best case..
        if(index ==a.length){
            return 0;
        }
        // recursivly call the sum method to add rest of the element of the array.
        return a[index]+sum(a, index+1);
    }
}
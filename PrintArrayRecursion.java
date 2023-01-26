/*
 * By: Mayank Kumar
 * Program to print the array using recursion.
 * Logic:
 * Create the method printArray which will take two arguments
 * first Array and second is index,
 * for best case return 0 if index exceded the length-1;
 * otherwise print the first element and recursivly call the printArray
 * method for rest of the array.
*/

class PrintArrayRecursion{
    public static void main(String [] args){
        int a [] = {3,5,6,7,8,2,1,6,-9};
        int index =0;
        printArray(a, index);

    }
    // function to print the array.
    static void printArray(int a [], int index){
        // if index became equal of the length then retun from the method.
        if(index == a.length){
            return;
        }
        // print the first element of the array.
        System.out.print(a[index]+" ");
        
        // recursively call the printArray method for rest of the array elements.
        printArray(a, index+1);
    }
}
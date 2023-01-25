/* 
 *Name : Mayank Kumar 
 * logic -- 
 * compare the key with array element if found the return true otherwise
 * recursivly call the function for rest of the array.
 * return false for the ArrayIndexOutOfBoundException and NullPointerException
*/


class LinerSearchRecursion{
    public static void main(String args [] ){
        int a [] = {2,4,6,7,9,0,1,3,5,10};
        int key =10; 
        int index =0;
        if(linerSearch(a,index,key))
            System.out.println(key+ " Found");
        else
            System.out.println(key+" Not Found");
        
    }
    // function for linerSearch
    static boolean linerSearch(int a[], int index, int key){
        
        // return false for ArrayIndexOutOfBound and NullPointerException
        if(index <0 || index >= a.length){
            return false;
        }
        // return true if key found
        if(a[index] == key){
            return true;
        }
        // recursivly call the linerSearch.
        return linerSearch(a, index+1, key);
    }
}

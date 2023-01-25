// Linear Search Algorithm implementatin using the recursion.

class LinerSearchRecursion{
    public static void main(String args [] ){
        int a [] = {2,4,6,7,9,0,1,3,5,10};
        int key =10; 
        int index =0;

       System.out.println( linerSearch(a,index,key));
        
    }
    static boolean linerSearch(int a[], int index, int key){
        
        if(index <0 || index >= a.length){
            return false;
        }
        if(a[index] == key){
            return true;
        }
        
        return linerSearch(a, index+1, key);
    }
}

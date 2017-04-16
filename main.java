/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String args[])
    {
       int arr1[] = {1,2,3,4,5,6,7,8,9,10};
       SubArray maxArray1 = new SubArray();
       maxArray1.getMaxSumSubArray(arr1);
       maxArray1.pintSubArray(arr1);
       
       
       int arr2[] = {1,2,-5,-4,-5,-6,-7,1,9,10};
       SubArray maxArray2 = new SubArray();
       maxArray2.getMaxSumSubArray(arr2);
       maxArray2.pintSubArray(arr2);
       
       int arr3[] = {-1,-2,-5,-4,-5,-6,-7,-1,-9,-10};
       SubArray maxArray3 = new SubArray();
       maxArray3.getMaxSumSubArray(arr3);
       maxArray3.pintSubArray(arr3);
    }
    
    
   
    
}

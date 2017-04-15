/*
 * This class will be used to represent a sub array
 */
public class SubArray
{
    int startIndex;//this is the index in the original array where the sub array starts
    int endIndex;//this is the index in the original array where the sub array ends
    int sum;//this is the sum of the given sub array
    
    //this is the default constructor, it makes the sub array just the first element of the original array
    public SubArray()
    {
        startIndex = 0;
        endIndex = 0;
    }
    
    
    //this constructor creates a new sum array given the start and end index and the original array
    public SubArray(int start, int end, int arr[])
    {
        startIndex = 0;
        endIndex = 0;
        this.calcSum(arr);
    }
    
    
    //this method calculate the value of sum given the original array
    public void calcSum(int arr[])
    {
        sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
    }
    
    //this method will add a value to the sum
    public void addToSum(int toAdd)
    {
        sum += toAdd;
    }
    
    public void setSum(int toSet)
    {
        sum = toSet;
    }
  
}

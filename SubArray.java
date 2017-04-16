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
    
    


    
    public void pintSubArray(int arr[])
    {
        if(startIndex == -1 || endIndex == -1)//if the sub array is the empty array
        {
            System.out.println("The sum is 0");
            System.out.println("The sub array is []");
        }
        else
        {
            System.out.println("The sum is " + sum);
            System.out.print("The sub array is [" );
            for(int i = startIndex; i < endIndex; i++)
            {
                System.out.print(arr[i] + ", ");
            }
            System.out.print(arr[endIndex] +  "]\n");
        }
    }
    
    
    
    
    
    
    public void getMaxSumSubArray(int arr[])
    {
        //This is the sub array that will hold the max sum sub array
        this.startIndex = 0;
        this.endIndex = 0;
        this.sum = arr[0];
        
        //this sub array will hold the current max form Kadanes algorithm
        SubArray currentMax = new SubArray();
        currentMax.sum = arr[0];
        
        
        //loop through the array running Kadane's algorithm
        for(int i = 1; i < arr.length; i++)
        {
            if(currentMax.sum < 0)
            {
                currentMax.startIndex = i;
                currentMax.endIndex = i;
                currentMax.sum = arr[i];
            }
            else
            {
                //currentMax = new SubArray(currentMax.startIndex, i, arr);
                currentMax.endIndex = i;
                currentMax.sum += arr[i];

            }
            
            if(currentMax.sum > this.sum)
            {
                this.startIndex = currentMax.startIndex;
                this.endIndex = currentMax.endIndex;
                this.sum = currentMax.sum;
            }
        }
       
        //if the global max sum is 0 then every element in the array was negative, the sub array should just be the empty array
       if(this.sum < 0)
       {
           this.startIndex = -1;
           this.endIndex = -1;
           this.sum = 0;
       }
        
        
    }
  
}

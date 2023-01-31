public class Solution 
{
    static void swap(int i,int j,int arr[])
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(low,mid,arr);
                low++;mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else if(arr[mid]==2)
            {
                swap(mid,high,arr);
                high--;
            }
        }
    }
}

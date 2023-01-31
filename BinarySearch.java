class Solution 
{
    int binarysearch(int arr[], int n, int k) 
    {
        // code here
        return search(arr,0,n-1,k);
    }
    static int search(int []arr,int low,int high,int k)
    {
        int mid=(low+high)/2;
        if(low>high)
            return -1;
        if(arr[mid]==k)
            return mid;
        else if(arr[mid]>k)
            return search(arr,low,mid-1,k);
        else
            return search(arr,mid+1,high,k);
    }
}

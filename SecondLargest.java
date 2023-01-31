

//User function Template for Java

class Solution 
{
    int print2largest(int arr[], int n) 
    {
        // code here
        if (n < 2)
	    {
		    return -1;
	    }
	    int max = arr[0];
	    int second_max = -1;
	    for (int i = 0; i < n; i++)
	    {
	        if (arr[i] > max)
	        {
		        second_max = max;
		        max = arr[i];
	        }
	        else if (arr[i] > second_max && arr[i] < max)
	        {
		        second_max = arr[i];
	        }
	    }
        return second_max;
    }
}

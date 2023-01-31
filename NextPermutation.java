public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
        if(permutation == null || permutation.size() <= 1) return permutation;
        int index=permutation.size()-2,i=0,j=0,k=permutation.size()-1;
        while(index>=0)
        {
            if(permutation.get(index)<permutation.get(index+1))             {
                i=index;break;
            }
            index--;
        }
        while(k>=0)
        {
            if(permutation.get(k)>permutation.get(i))
            {
                j=k;
                break;
            }
            k--;
        }
        swap(i,j,permutation);
        if(i==0 && j==0)
            return reverse(permutation,i,permutation.size()-1);
        return reverse(permutation,i + 1,permutation.size()-1);
	}
    static void swap(int i,int j,ArrayList<Integer> permutation)
    {
        Collections.swap(permutation,i,j);
    }
    static ArrayList<Integer> reverse(ArrayList<Integer> permutation,int i,int j)
    {
        while(i<j) swap(i++,j--,permutation);
        return permutation;
    }
}

public class Solution 
{
	public static ArrayList<ArrayList<Long>> printPascal(int n) 
    {
           ArrayList<ArrayList<Long>> arr=new ArrayList<>();
           ArrayList<Long> ar=new ArrayList<>();
           ar.add(1L);
           arr.add(ar);
           for(int i=1;i<n;i++)
           {
               ArrayList<Long> array=new ArrayList<>();
               array.add(1L);
               for(int j=0;j<i-1;j++)
               {
                  array.add(arr.get(i-1).get(j)+arr.get(i-1).get(j+1));
               }
               array.add(1L);
               arr.add(array);
           }
           return arr;
	}
}

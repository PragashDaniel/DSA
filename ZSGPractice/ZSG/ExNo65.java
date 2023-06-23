package com.zsg.practice;

public class ExNo65 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,4,5,6,6,6,7,1,1};
		frequency(arr);
	}

	static int max(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	static void findFrequency(int[] arr)
	{
		boolean []visited=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					visited[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
	}
	
	static void frequency(int a[])
	{
		int frequency[]=new int[max(a)+1];
		boolean visit[]=new boolean[frequency.length];
		for(int i=0;i<a.length;i++)
		{
			frequency[a[i]]++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(frequency[a[i]]>1 && visit[a[i]]==false)
			{
				visit[a[i]]=true;
				System.out.println(a[i]+" "+frequency[a[i]]);
			}
		}
					
	}
}

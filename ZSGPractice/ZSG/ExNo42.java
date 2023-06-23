package com.zsg.practice;

public class ExNo42 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]={1,1,2,3,4,5,5,2,3};
		findFrequency(arr);
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
}

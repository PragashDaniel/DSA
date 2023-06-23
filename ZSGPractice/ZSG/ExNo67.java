package com.zsg.practice;

import java.util.Arrays;

public class ExNo67 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,2,3,4,5,5,6,7,7};
		//findDuplicates(arr);
		findDup(arr);
	}
	static void findDup(int arr[])
	{
		Arrays.sort(arr);
		int c=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1] && c==0)
			{
				System.out.print(arr[i]+" ");
				c=1;
			}
			if(arr[i]!=arr[i+1])
				c=0;
		}
	}
	static void findDuplicates(int a[])
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
				System.out.println(a[i]);
			}
		}	
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

}

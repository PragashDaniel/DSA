package com.zsg.practice;

import java.util.Arrays;

public class ExNo54 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		sort(arr);
	}
	static void sort(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				for(int j=i;j<arr.length;j=j+2)
				{
					if(arr[i]<arr[j])
					{
						swap(i,j,arr);
					}
				}
			}
			else
			{
				for(int j=i;j<arr.length;j=j+2)
				{
					if(arr[i]>arr[j])
					{
						swap(i,j,arr);
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int i,int j,int []arr)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

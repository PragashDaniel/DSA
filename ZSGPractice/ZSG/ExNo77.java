package com.zsg.practice;

import java.util.Arrays;

public class ExNo77 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {5,2,1,3,4};
		sort1(arr);
		sort2(arr);
	}
	
	static void sort2(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0,k=1;j<arr.length-1;j++,k++)
			{
				if(arr[j]>arr[k])	
					swap(arr,j,k);
			}
		}
		System.out.println("After Sort : "+Arrays.toString(arr));
	}
	static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void sort1(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
					swap(arr,i,j);
			}
		}
		System.out.println("After Sort : "+Arrays.toString(arr));
	}

}

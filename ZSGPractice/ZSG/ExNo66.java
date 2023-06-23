package com.zsg.practice;

import java.util.Arrays;

public class ExNo66 {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7};
		int n=3;
		//leftRotate(arr,n);
		left(arr,n);
	}
	static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void left(int arr[],int n)
	{
		int split=arr.length-n;//7-3=4
		for(int i=arr.length-split,j=arr.length-1;i<j;i++,j--)//7-4
		{
			swap(arr,i,j);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0,j=(arr.length-split)-1;i<j;i++,j--)
		{
			swap(arr,i,j);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			swap(arr,i,j);
		}
		System.out.println("After left rotation : "+Arrays.toString(arr));
		
	}
	
	static void leftRotate(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int first=arr[0];
			int j=0;
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		
		System.out.println("After left rotation : "+Arrays.toString(arr));
	}
}

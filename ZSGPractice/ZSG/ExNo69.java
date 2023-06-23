package com.zsg.practice;

import java.util.Arrays;

public class ExNo69 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int n=3;
		rightRotate(arr,n);
		right(arr,n);
	}
	
	static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void right(int arr[],int n)
	{
		int split=arr.length-n;//7-2=5
		for(int i=0,j=split-1;i<j;i++,j--)
		{
			swap(arr,i,j);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=split,j=arr.length-1;i<j;i++,j--)//7-4
		{
			swap(arr,i,j);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			swap(arr,i,j);
		}
		System.out.println("After right rotation : "+Arrays.toString(arr));
		
	}
	
	static void rightRotate(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int last=arr[arr.length-1];
			int j=0;
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		
		System.out.println("After right rotation : "+Arrays.toString(arr));
	}
}

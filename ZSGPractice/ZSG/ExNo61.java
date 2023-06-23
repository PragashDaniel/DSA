package com.zsg.practice;

import java.util.Arrays;

public class ExNo61 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		reverse1(arr);
		reverse2(arr);
	}

	static void reverse1(int arr[])
	{
		int temp[]=new int[arr.length];
		for(int i=arr.length-1,j=0;i>=0;i--,j++)
		{
			temp[j]=arr[i];
		}
		System.out.print("After Reverse : ");
		System.out.println(Arrays.toString(temp));
	}
	
	static void reverse2(int arr[])
	{
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.print("After Reverse : ");
		System.out.println(Arrays.toString(arr));
	}
}

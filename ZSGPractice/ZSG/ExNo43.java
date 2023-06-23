package com.zsg.practice;

import java.util.Arrays;

public class ExNo43 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int n=3;
		leftRotate(arr,n);
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

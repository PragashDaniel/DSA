package com.zsg.practice;

import java.util.Arrays;

public class ExNo46 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int n=3;
		RightRotate(arr,n);
	}
	
	static void RightRotate(int arr[],int n)
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

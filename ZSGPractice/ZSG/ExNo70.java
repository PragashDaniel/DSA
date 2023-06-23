package com.zsg.practice;

import java.util.Arrays;

public class ExNo70 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []arr= {1,5,3,2,4,9,};
		secondMax(arr);
	}
	
	static void secondMax(int arr[])
	{
		int max=arr[0],secondMax=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				secondMax=max;
				max=arr[i];
			}	
		}
		System.out.println("Second Max : "+secondMax);
	}

	static void secondLargest(int arr[])
	{
		Arrays.sort(arr);
		System.out.println("Second Max : "+arr[arr.length-2]);
	}
}

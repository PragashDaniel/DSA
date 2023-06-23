package com.zsg.practice;

import java.util.Arrays;

public class ExNo71 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {5,3,2,1,4};
		secondMin(arr);
	}
	static void second(int arr[])
	{
		Arrays.sort(arr);
		System.out.println("Second Min : "+arr[1]);
	}
	static void secondMin(int a[])
	{
		int min=a[0],second=0;
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				second=min;
				min=a[i];
			}	
		}
		System.out.println("Second Min : "+second);	
	}
}

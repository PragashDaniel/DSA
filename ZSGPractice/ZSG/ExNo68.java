package com.zsg.practice;

public class ExNo68 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		sum1(arr,arr.length);
		System.out.println("Sum of array : "+sum2(arr,0));
	}
	
	static void sum1(int arr[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of array : "+sum);
	}

	static int sum2(int arr[],int i)
	{
		if(i==arr.length-1)
			return arr[i];
		return arr[i]+sum2(arr,++i);
		
	}
}

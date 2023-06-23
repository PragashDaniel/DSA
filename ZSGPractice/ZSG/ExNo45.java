package com.zsg.practice;

public class ExNo45 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Sum of elements in Array : "+sum(new int[] {1,2,3,4,5}));
	}

	static int sum(int []arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	
}

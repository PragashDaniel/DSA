package com.zsg.practice;

public class ExNo75 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		check1(arr);
		check2(arr);
	}
	
	static void check2(int arr[])
	{
		System.out.print("Even Numbers : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((arr[i]%2==0)?arr[i]+" ":"");
		}
		System.out.print("\nOdd Numbers : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((arr[i]%2!=0)?arr[i]+" ":"");
		}
	}
	
	static void check1(int arr[])
	{
		System.out.println("Even Numbers");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.println(arr[i]);
		}
		System.out.println("Odd Numbers");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				System.out.println(arr[i]);
		}
	}
}

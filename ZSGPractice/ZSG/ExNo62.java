package com.zsg.practice;

public class ExNo62 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6};
		print2(arr);
	}

	static void print1(int arr[])
	{
		System.out.print("Odd Position elements : ");
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.print("\nEven  Position elements :");
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	static void print2(int arr[])
	{
		System.out.println("Odd | Even");
		for(int i=0;i<arr.length-1;i++)
		{
			if(i%2==0)
				System.out.println(arr[i]+"       "+arr[i+1]);
		}
	}
}

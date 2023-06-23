package com.zsg.practice;

public class ExNo40 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,3,1};
		findMin(arr);
	}

	static void findMin(int []arr)
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			min=(arr[i]<min)?arr[i]:min;
		}
		System.out.println("Largest element : "+min);
	}
}

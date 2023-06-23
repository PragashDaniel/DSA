package com.zsg.practice;

import java.util.Arrays;

public class ExNo63 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,1,4};
		maxMin(arr);
		minMax(arr);
	}
	static void maxMin(int arr[])
	{
		Arrays.sort(arr);
		System.out.println("Smallest element : "+arr[0]);
		System.out.println("Largest Element : "+arr[arr.length-1]);
	}

	static void minMax(int arr[])
	{
		int min=arr[0],max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			else if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Smallest element : "+min);
		System.out.println("Largest Element : "+max);
	}
}

package com.zsg.practice;

import java.util.Arrays;

public class ExNo64 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		copy1(arr);
		copy2(arr);
	}

	private static void copy2(int[] arr) {
		// TODO Auto-generated method stub
		int copy[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i];
		}
		System.out.println("Copied Array : "+Arrays.toString(copy));
	}

	private static void copy1(int[] arr) 
	{
		// TODO Auto-generated method stub
		int copy[]=new int[arr.length];
		int i=0,j=arr.length-1;
		while(i<=j)
		{
			copy[i]=arr[i++];
			copy[j]=arr[j--];
		}
		System.out.println("Copied Array : "+Arrays.toString(copy));
	}

}

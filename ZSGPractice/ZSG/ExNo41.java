package com.zsg.practice;

import java.util.Arrays;

public class ExNo41 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Original Array : "+Arrays.toString(arr1));
		System.out.println("Copied Array : "+Arrays.toString(arr2));
	}

}

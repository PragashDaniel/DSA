package com.zsg.practice;

import java.util.Arrays;

public class ExNo90 
{
	public static void main(String[] args) 
	{
		String arr[]= {"Pragash","Daniel","Shiva","Mahadev","Guru","pragash"};
		sort1(arr);
		sort2(arr);
	}
	
	static void sort1(String []arr)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int i,int j,String[] arr)
	{
		String temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void sort2(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
					if(arr[i].charAt(0)>arr[j].charAt(0))
						swap(i,j,arr);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

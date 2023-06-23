package com.zsg.practice;

import java.util.Arrays;

public class ExNo10 
{
	public static void main(String[] args) 
	{
		int[] array= {1,2,3,4,5,6,7,};
		sort(array,array.length);
	}
	
	static void sort(int arr[],int size)
	{
		Arrays.sort(arr);
		int i=0,j=arr.length-1;
		while(i<=j)
		{
			if(i==j)
			{
				System.out.println(arr[i]);
				break;
			}
			System.out.print(arr[j--]+" ");
			System.out.print(arr[i++]+" ");
		}
	}
}

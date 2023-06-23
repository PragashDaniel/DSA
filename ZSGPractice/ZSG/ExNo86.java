package com.zsg.practice;

import java.util.Arrays;

public class ExNo86 
{	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char[] arr= {'d','a','n','i'};
		print1(arr);
		print2(arr);
	}
	
	static void print1(char arr[])
	{
		for(char ch:arr)
			System.out.print(ch);
	}
	
	static void print2(char arr[])
	{
		System.out.println("\n"+Arrays.toString(arr));
	}
}

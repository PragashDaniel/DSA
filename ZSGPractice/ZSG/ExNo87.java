package com.zsg.practice;


public class ExNo87 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char[] arr= {'d','a','n','i'};
		toString1(arr);
		toString2(arr);
	}

	private static void toString2(char[] arr) 
	{
		String s=new String(arr);
		System.out.println(s);
	}

	private static void toString1(char []arr) 
	{
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			s+=arr[i];
		}
		System.out.println(s);
	}
}

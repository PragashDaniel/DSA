package com.zsg.practice;

public class ExNo50 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=9;
		pattern(n);
	}

	static void pattern(int n)
	{
		int count=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<count;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			count++;
			System.out.println();
		}
	}
}

package com.zsg.practice;

public class ExNo47 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int noOfRows=9;
		pattern(noOfRows);
	}
	
	static void pattern(int n)
	{
		int count=1;
		for(int i=n;i>=0;i--)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=count;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=count-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			count++;
		}
	}
}

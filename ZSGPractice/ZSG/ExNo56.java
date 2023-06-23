package com.zsg.practice;

public class ExNo56 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=4;
		print(n);
	}

	static void print(int n)
	{
		int m=n+4-1,c=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=m;k>=1;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print((c++)+" ");
			System.out.println();
			m--;
		}
	}
}

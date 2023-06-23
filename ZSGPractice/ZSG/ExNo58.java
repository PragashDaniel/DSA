package com.zsg.practice;

public class ExNo58 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=4;
		print(n);
	}
	static void print(int n)
	{
		int s=2;
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				for(int j=0;j<n*2;j++)
					System.out.print("*");
				System.out.println();
				continue;
			}
			for(int j=n-i;j>=0;j--)
				System.out.print("*");
			for(int j=1;j<=s && s<n*2;j++)
				System.out.print("_");
			for(int j=n-i;j>=0;j--)
				System.out.print("*");
			s+=2;
			System.out.println();
		}
		for(int i=1;i<=n-1;i++)
		{
			if(i==n-1)
			{
				for(int j=0;j<n*2;j++)
					System.out.print("*");
				System.out.println();
				continue;
			}
			for(int j=i;j>=0;j--)
				System.out.print("*");
			for(int j=1;j<=(s-n);j++)
				System.out.print("_");
			for(int j=i;j>=0;j--)
				System.out.print("*");
			s=s-2;
			System.out.println();
		}
	}
}

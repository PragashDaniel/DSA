package com.zsg.practice;

public class ExNo48 {

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
			for(int j=1;j<=i*2;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			count++;
		}
	}

}

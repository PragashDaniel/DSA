package com.zsg.practice;

public class ExNo60 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=5;
		sumOfSeries(n);
	}

	static void sumOfSeries(int n) 
	{
		int sum=1;int ans=0;
		for(int i=0;i<n;i++)
		{
			if(i!=n-1)
				System.out.print(sum+"+");
			ans=ans+sum;
			sum=(sum*10)+1;
		
		}
		System.out.print(sum);
		System.out.println("\nThe sum is : "+ans);
	}

}

package com.zsg.practice;

public class ExNo34 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=5;
		sumOfNumbers(n);
	}
	static int sumOfDigitsMax(int s)
	{
		int sum=0;
		while(s!=0)
		{
			sum=sum+s%10;
			s=s/10;
		}
		return sum;
	}
	static void sumOfNumbers(int n)
	{
		int sum=0,max=0,sod=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			sod=sumOfDigitsMax(sum);
			max=(sod>=max)?sod:max;
		}
		System.out.println("Largest digit sum : "+max);
	}
}

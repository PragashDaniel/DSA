package com.zsg.practice;

public class ExNo35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=5;
		fact(fact);
	}

	static void fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial : "+fact);
		System.out.println("Sum of Digits : "+sumOfDigits(fact));
	}
	
	static int sumOfDigits(int s)
	{
		int sum=0;
		while(s!=0)
		{
			sum=sum+s%10;
			s=s/10;
		}
		return sum;
	}
}

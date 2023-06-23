package com.zsg.practice;

public class ExNo51 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=12345;
		reverse(n);
	}
	
	static void reverse(int n)
	{
		int reverse=0;
		while(n!=0)
		{
			reverse=reverse*10+(n%10);
			n/=10;
		}
		System.out.println(reverse);
	}

}

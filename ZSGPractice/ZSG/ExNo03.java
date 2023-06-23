package com.zsg.practice;

import java.util.Scanner;

public class ExNo03 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int sum=n-reverse(n);
		System.out.println(sum);
	}
	static int reverse(int n)
	{
		int r=0;
		for(int i=n;i>0;i=i/10)
		{
			r=r*10+i%10;
		}
		return r;
	}

}

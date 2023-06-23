package com.zsg.practice;

import java.util.Scanner;

public class ExNo06 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Total Students : ");
		int n=sc.nextInt();
		group(n);
	}
	static void group(int n)
	{
		for(int i=1;i<n/4;i++)
		{
			System.out.println("Group : "+i);
			for(int j=i;j<=n;j=j+4)
			{
				System.out.println(100+j);
			}
			System.out.println();
		}
	}
}

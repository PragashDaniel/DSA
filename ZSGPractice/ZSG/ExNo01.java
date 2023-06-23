package com.zsg.practice;

import java.util.Scanner;

public class ExNo01 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		generate(sc.nextInt(),sc);
	}
	
	static void generate(int x,Scanner sc)
	{
		System.out.println("Enter Range : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(x+" * "+i+" = "+x*i);
			System.out.println("   "+x+" - "+i+" = "+(x-i));
		}
	}

}

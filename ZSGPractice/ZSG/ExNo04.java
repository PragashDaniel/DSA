package com.zsg.practice;

import java.util.Scanner;

public class ExNo04 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character : ");
		print(sc.next().charAt(0));
	}
	static void print(char c)
	{
		char ch=c;
		for(char i=ch;i>=65;i--)
		{
			for(char j=65;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

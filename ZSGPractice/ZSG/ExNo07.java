package com.zsg.practice;

import java.util.Scanner;

public class ExNo07 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		print(s);
	}

	static void print(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(i==j || j==(s.length()-1)-i) 
					System.out.print(s.charAt(i));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}


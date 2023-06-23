package com.zsg.practice;

import java.util.Scanner;

public class ExNo02 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch=sc.next().charAt(0);
		print(ch);
	}
	
	static void print(char ch)
	{
		while(ch<=90)
		{
			System.out.print(ch++);
		}
	}

}

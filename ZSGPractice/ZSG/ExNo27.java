package com.zsg.practice;

public class ExNo27 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.println("Before Swapping\na = "+a);
		System.out.println("b = "+b);
		swap(a,b);
		
	}

	static void swap(int a,int b)
	{
		int temp=a;
		a=b;b=temp;
		
		System.out.println("After Swapping \na = "+a);
		System.out.println("b = "+b);
	}
}

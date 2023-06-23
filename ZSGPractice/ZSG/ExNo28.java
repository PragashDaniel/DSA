package com.zsg.practice;

public class ExNo28 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=5;
		if(check(num))
			System.out.println(num+" is Even");
		else
			System.out.println(num+" is Odd");
	}
	
	static boolean check(int num)
	{
		return num%2==0;
	}

}

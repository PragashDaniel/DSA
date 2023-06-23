package com.zsg.practice;

public class ExNo30 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10,b=40,c=30;
		check(a,b,c);
		
	}
	
    static void check(int a,int b,int c)
    {
    	if(a>=b && a>=c)
			System.out.println(a+" is the largest number");
		else if(b>=a && b>=c)
			System.out.println(b+" is the largest number");
		else if(c>=a && c>=b)
			System.out.println(c+" is the largest number");
    }

}

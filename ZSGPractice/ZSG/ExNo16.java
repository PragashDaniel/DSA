package com.zsg.practice;

public class ExNo16 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//ax^2+bx+c
		int a=2,b=3,c=-2;
		double x1=((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
		double x2=((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
		System.out.println((a*(x1*x1)+b*x1+c)==0);
		System.out.println((a*(x1*x1)+b*x1+c)==0);
	}

}

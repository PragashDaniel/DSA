package com.zsg.practice;

public class ExNo17 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x=6;
		int y=3;
		System.out.println(calculateArea(x,y));
	}
	static double calculateArea(int x,int y)
	{
		double areaX=Math.PI*x*x;
		double areaY=Math.PI*y*y;
		return areaX-areaY;
	}
}

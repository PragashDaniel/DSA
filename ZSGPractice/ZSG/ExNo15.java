package com.zsg.practice;

import java.util.Scanner;

public class ExNo15 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius : ");
		Double r=sc.nextDouble();
		System.out.println("Enter the Height : ");
		Double h=sc.nextDouble();
		areaOfCylinder(r,h);
	}
	static void areaOfCylinder(double r,double h)
	{
		System.out.println("Arear of Cylinder : "+(2*Math.PI*r*(r+h)));
	}
}

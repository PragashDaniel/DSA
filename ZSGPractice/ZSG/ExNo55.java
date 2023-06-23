package com.zsg.practice;

public class ExNo55 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=4;
		print(n);
	}
	 static void print(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++) 
			 {
				 if(i==0  || i==n-1)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print("*");
					 break;
				 }
			 }
			 System.out.println();
		 }
	 }
}

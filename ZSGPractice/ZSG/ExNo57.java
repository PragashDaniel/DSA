package com.zsg.practice;

public class ExNo57 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="12345";
		print(s);
	}
	
	static void print(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(i==j || j==(s.length()-1)-i) 
					System.out.print(s.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

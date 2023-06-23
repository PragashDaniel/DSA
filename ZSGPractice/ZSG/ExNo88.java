package com.zsg.practice;

public class ExNo88 
{
	public static void main(String[] args) 
	{
		String str="I am dani";
		toWord1(str);
		toWord2(str);
	}

	static void toWord1(String str) 
	{
		String string[]=str.split(" ");
		for(int i=0;i<string.length;i++)
		{
			System.out.print(string[i]+" ");
		}
	}
	
	static void toWord2(String str) 
	{
		String string[]=str.split(" ");
		int i=0;
		while(i<string.length)
		{
			System.out.print(string[i++]+" ");
		}
	}
}

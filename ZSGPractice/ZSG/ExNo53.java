package com.zsg.practice;

public class ExNo53 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="a2b10c30";
		print(str);
	}
	
	static void print(String str)
	{
		char ch=str.charAt(0);
		int num=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(j)>=48 && str.charAt(j)<=57)
					num=(num*10)+(str.charAt(j)-'0');
				else
					break;
			}	
			if(!(str.charAt(i)>=48 && str.charAt(i)<=57))
				ch=str.charAt(i);
			for(int j=0;j<num;j++)
			{
				System.out.print(ch);
			}
			num=0;
			
		}
	}

}

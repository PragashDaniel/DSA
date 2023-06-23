package com.zsg.practice;

public class ExNo59 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="test123";
		String s2="123";
		System.out.println(check(s1,s2));
	}

	static int check(String s1,String s2)
	{
		for(int i=0;i<s1.length()-s2.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s2.charAt(j)!=s1.charAt(i+j))
					break;
				if(j==s2.length()-1)
					return i;
			}
		}
		return -1;
	}
}

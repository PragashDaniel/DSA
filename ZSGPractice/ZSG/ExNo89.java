package com.zsg.practice;

public class ExNo89 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="I am Dani from Tirunelveli";
		toWord1(str);
		toWord2(str);
	}
	
	static void toWord1(String str)
	{
		String s="";
		String[] arr=new String[count(str)];
		for(int i=0,j=0;i<str.length();i++)
		{
			s+=str.charAt(i);
			if(str.charAt(i)==' ' || str.length()-1==i)
			{
				arr[j]=s;
				s="";
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
	static void toWord2(String str)
	{
		String s="";
		String[] arr=new String[count(str)];
		int i=0,j=0;
		while(i<str.length())
		{
			s+=str.charAt(i);
			if(str.charAt(i)==' ' || str.length()-1==i)
			{
				arr[j]=s;
				s="";
				j++;
			}
			i++;
		}
		int k=0;
		while(k<arr.length)
		{
			System.out.print(arr[k++]);
		}
	}
	
	static int count(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)==' ')
				count++;
		}
		return count+1;
	}
}

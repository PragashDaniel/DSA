package com.zsg.practice;

public class ExNo52 
{
	public static void main(String[] args) 
	{
		String str="one two three four";int i;
		System.out.println(reverse(str,"","",i=0));
	}

	static String reverse(String s,String word,String ans,int i)
	{		
		if(i==s.length())
		{
			ans=word+" "+ans;
			return ans;
		}
		word+=s.charAt(i);
		if(s.charAt(i)==' ')
		{
			ans=word+ans;
			word="";
		}
		return reverse(s,word,ans,++i);
	}
}

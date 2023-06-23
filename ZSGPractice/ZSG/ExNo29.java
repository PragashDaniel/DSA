package com.zsg.practice;

public class ExNo29 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char ch='E';
		check(ch);
	}

	static void check(char ch)
	{
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')||
				ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				System.out.println("It's a vowel");
			else
				System.out.println("It's a Consonant");
		}
		else
			System.out.println("Neither Vowel not Consonant");
		
	}
}

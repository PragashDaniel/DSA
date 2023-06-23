package com.zsg.practice;

public class ExNo33 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char ch='1';
		System.out.println(isAlphabet(ch));
	}
	
	static String isAlphabet(char c)
	{
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
	}

}

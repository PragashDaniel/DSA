package com.zsg.practice;

public class ExNo32 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number = -912;
        System.out.println(number + " is "+checkPosNeg(number));
	}
	
	static String checkPosNeg(int x)
    {
		if(x!=0)
        	return x>0?"Positive":"Negative";
        return "zero";
    }

}

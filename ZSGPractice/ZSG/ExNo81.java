package com.zsg.practice;

public class ExNo81 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int matrix1[][]= {{1,2,3},
				   		  {4,5,6},
				   		  {7,8,9}};
		int matrix2[][]= {{1,2,3},
				   		  {4,5,6},
				   		  {7,8,9}};
		check1(matrix1,matrix2);
		check2(matrix1,matrix2);
	}
	
	static void check2(int[] matrix1[],int matrix2[][])
	{
		int c=0;
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[0].length;j++)
			{
				if(matrix1[i][j]!=matrix2[i][j])
				{
					c=1;
					break;
				}
			}
			if(c==1)
				break;
		}
		if(c==0)
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
	}
	static void check1(int[] matrix1[],int matrix2[][])
	{
		int c=0;
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[0].length;j++)
			{
				if(matrix1[i][j]==matrix2[i][j])
					c++;
			}
		}
		if(c==matrix1.length*matrix1[0].length)
			System.out.println("Equal");
		else
			System.out.println("UnEqual");
	}

}

package com.zsg.practice;

public class ExNo80 
{
	public static void main(String[] args) 
	{
		int mat[][]={{1,2,3},
					 {0,0,0},
					 {0,0,9}};
		check1(mat);
		check2(mat);
	}

	static void check2(int mat[][])
	{
		int c=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				if(mat[i][j]==0)
					c++;
			}
		}
		if(c>mat.length*mat[0].length/2)
			System.out.println("It's a sparse matrix");
		else
			System.out.println("It's not a sparse matrix");
			
	}
	static void check1(int[][] mat) 
	{
		// TODO Auto-generated method stub
		int c1=0,c2=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				if(mat[i][j]==0)
					c1++;
				else
					c2++;
			}
		}
		if(c1>c2)
			System.out.println("It's a sparse matrix");
		else
			System.out.println("It's not a sparse matrix");
	}
	
}

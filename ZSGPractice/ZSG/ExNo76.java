package com.zsg.practice;

import java.util.Arrays;

public class ExNo76 
{
	public static void main(String[] args) 
	{
		int matrix[][]=new int[][]{{1,2,3},
								   {4,5,6},
								   {7,8,9}};
		transpose2(matrix);							
	}
	
	static void transpose1(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=i;j<mat[0].length;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		System.out.println("Transpose of matrix : ");
		for(int i=0;i<mat.length;i++)
			System.out.println(Arrays.toString(mat[i]));
	}
	
	static void transpose2(int mat[][])
	{
		int i=0,j;
		while(i<mat.length)
		{
			j=i;
			while(j<mat[0].length)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
				j++;
			}
			i++;
		}
		System.out.println("Transpose of matrix : ");
		for(int k=0;k<mat.length;k++)
			System.out.println(Arrays.toString(mat[k]));
	}
}

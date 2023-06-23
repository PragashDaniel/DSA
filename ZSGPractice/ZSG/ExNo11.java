package com.zsg.practice;

public class ExNo11 
{
	public static void main(String[] args)
	{
		int[][] matrix= {{1,2,3},
						 {4,5,6},
						 {7,8,9}};
		rotateLeft(matrix);
	}
	
	
	static void rotateLeft(int [][]matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=i;j<matrix[0].length;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			int high=0;
			int low=matrix.length-1;
			while(high<low)
			{
				int temp = matrix[high][i];
				matrix[high][i]=matrix[low][i];
				matrix[low][i]=temp;
				high++;low--;
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

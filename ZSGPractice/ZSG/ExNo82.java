package com.zsg.practice;

public class ExNo82 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [][]matrix= {{1,2,3},
				 		 {4,5,6},
				 		 {7,8,9}};
		lowerMatrix1(matrix);
		lowerMatrix2(matrix);
	}

	static void lowerMatrix1(int [][]matrix) 
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(i<j)
					System.out.print(0+" ");
				else
					System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void lowerMatrix2(int[][] matrix)
	{
		int i=0;
		while(i<matrix.length)
		{
			int j=0;
			while(j<matrix.length)
			{
				if(i<j)
					System.out.print(0+" ");
				else
					System.out.print(matrix[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

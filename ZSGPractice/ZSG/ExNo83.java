package com.zsg.practice;

public class ExNo83 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [][]matrix= {{1,2,3},
		 		 		{4,5,6},
		 		 		{7,8,9}};
		upperMatrix1(matrix);
		upperMatrix2(matrix);
	}
	
	static void upperMatrix1(int [][]matrix) 
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(i>j)
					System.out.print(0+" ");
				else
					System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void upperMatrix2(int[][] matrix)
	{
		int i=0;
		while(i<matrix.length)
		{
			int j=0;
			while(j<matrix.length)
			{
				if(i>j)
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

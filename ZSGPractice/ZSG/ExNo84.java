package com.zsg.practice;

public class ExNo84 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] matrix= {{1,2,4},
					     {3,5,6},
					     {7,8,9}};
		 frequency1(matrix);
		 frequency2(matrix);
	}

	static void frequency1(int[][] matrix) 
	{
		// TODO Auto-generated method stub
		int even=0,odd=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(matrix[i][j]%2==0)
					even++;
				else 
					odd++;
			}
		}
		System.out.println("Odd : "+odd);
		System.out.println("Even : "+even);
	}
	
	static void frequency2(int[][] matrix) 
	{
		// TODO Auto-generated method stub
		int even=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(matrix[i][j]%2==0)
					even++;
			}
		}
		System.out.println("Odd : "+((matrix.length*matrix[0].length)-even));
		System.out.println("Even : "+even);
	}
}

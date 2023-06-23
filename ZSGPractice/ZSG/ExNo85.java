package com.zsg.practice;

public class ExNo85 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] matrix= {{1,2,4},
			     {3,5,6},
			     {7,8,9}};
		sum1(matrix);
		sum2(matrix);
	}

    static void sum2(int[][] matrix) 
	{
		// TODO Auto-generated method stub
		int sumRow=0;
    	for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				sumRow+=matrix[i][j];
			}
			System.out.println("Row "+(i+1)+" Sum : "+sumRow);
			sumRow=0;
		}
    	int sumCol=0;
    	for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				sumCol+=matrix[j][i];
			}
			System.out.println("Column "+(i+1)+" Sum : "+sumCol);
			sumCol=0;
		}
	}

	static void sum1(int[][] matrix) 
	{
		int sumRow=0;
    	int i=0;
    	while(i<matrix.length)
		{
			int j=0;
			while(j<matrix[0].length)
			{
				sumRow+=matrix[i][j];j++;
			}
			System.out.println("Row "+(i+1)+" Sum : "+sumRow);
			sumRow=0;i++;
		}
    	int sumCol=0;
    	int k=0;
    	while(k<matrix.length)
		{
    		int j=0;
    		while(j<matrix[0].length)
			{
				sumCol+=matrix[j][k];j++;
			}
			System.out.println("Column "+(i+1)+" Sum : "+sumCol);
			sumCol=0;k++;
		}
	}

}

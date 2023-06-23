package com.zsg.practice;

import java.util.Scanner;

public class ExNo78 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int row, col,i,j;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter the number of rows");
		row = in.nextInt();
		 
		System.out.println("Enter the number columns");
		col = in.nextInt();
		 
		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int res[][] = new int[row][col];
		 
		usingFor(mat1,mat2,res,row,col,in);
		usingWhile(mat1,mat2,res,row,col,in);
	}
	static void usingFor(int mat1[][],int mat2[][],int res[][],int row,int col,Scanner in)
	{
		System.out.println("Enter the elements of matrix1");
		int i,j;
		for ( i= 0 ; i < row ; i++ )
		{ 
		 
		for ( j= 0 ; j < col ;j++ )
		mat1[i][j] = in.nextInt();
		 
		System.out.println();
		}
		System.out.println("Enter the elements of matrix2");
		 
		for ( i= 0 ; i < row ; i++ )
		{
		 
		for ( j= 0 ; j < col ;j++ )
		mat2[i][j] = in.nextInt();
		 
		System.out.println();
		}
		 
		for ( i= 0 ; i < row ; i++ )
		for ( j= 0 ; j < col ;j++ )
		res[i][j] = mat1[i][j] - mat2[i][j] ; 
		 
		System.out.println("Sum of matrices:-");
		 
		for ( i= 0 ; i < row ; i++ )
		{ 
		for ( j= 0 ; j < col ;j++ )
		System.out.print(res[i][j]+"\t");
		 
		System.out.println();
		}
	}
		static void usingWhile(int mat1[][],int mat2[][],int res[][],int row,int col,Scanner in)
		{
			int i,j;
		System.out.println("Enter the elements of matrix1");
		i=0;
		while ( i < row)
		{ 
		j=0;
		while(j < col)
		{
		mat1[i][j] = in.nextInt();
		j++;
		}
		i++;
		 
		}
		System.out.println("Enter the elements of matrix2");
		 
		i=0;
		while ( i < row)
		{ 
		j=0;
		while(j < col)
		{
		mat2[i][j] = in.nextInt();
		j++;
		}
		i++;
		 
		}
		 
		i=0;
		while ( i < row)
		{ 
		j=0;
		while(j < col)
		{
		 
		res[i][j] = mat1[i][j] - mat2[i][j] ; 
		j++;
		}
		i++;
		 
		}
		 
		System.out.println("Sum of matrices:-");
		i=0;
		while ( i < row)
		{ 
		j=0;
		while(j < col)
		{
		 
		System.out.print(res[i][j]+"\t");
		j++;
		}
		System.out.println();
		i++;
		}
		
		 
	}

}

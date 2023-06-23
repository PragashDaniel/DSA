package com.zsg.practice;

public class ExNo79 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] mat= {{1,0,0},
					  {0,1,0},
					  {0,0,1}};
		checkIdentity1(mat);
		checkIdentity2(mat);
	}

	static void checkIdentity2(int mat[][])
	{
		int flag=1;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				if(i==j && mat[i][j]!=1) 
				{
					flag=0;
					break;
				}
				if(i!=j && mat[i][j]!=0)
				{
					flag=0;
					break;
				}
			}
			if(flag==0) break;
		}
		if(flag==1)
			System.out.println("It's an Identity matrix");
		else
			System.out.println("It's not an Identity matrix");
	}
	
	static void checkIdentity1(int mat[][])
	{
		int count=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				if(i==j && mat[i][j]==1)
				{
					count++;
				}
				else if(mat[i][j]!=0) 
				{
					count=-1;
					break;
				}	
			}
			if(count==-1)
				break;
		}
		if(count==mat.length)
			System.out.println("It's an Identity matrix");
		else
			System.out.println("It's not an Identity matrix");
	}
}

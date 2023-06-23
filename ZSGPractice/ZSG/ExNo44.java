package com.zsg.practice;

public class ExNo44 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []arr= {1,2,3,1,4,5,5,3,2};
		findDuplicates(arr);
	}

	static void findDuplicates(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}

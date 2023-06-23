package com.zsg.practice;

public class ExNo37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		printOddPosition(arr);
	}

	static void printOddPosition(int arr[])
	{
		System.out.print("Odd Position Elements : ");
		for(int i=0;i<arr.length-1;i++)
		{
			if(i%2==0)
				System.out.print(arr[i]+" ");
		}
	}
}

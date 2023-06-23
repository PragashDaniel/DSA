package com.zsg.practice;

public class ExNo39 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr= {1,4,2,5,3};
		findMax(arr);
	}
	
	static void findMax(int []arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			max=(arr[i]>max)?arr[i]:max;
		}
		System.out.println("Largest element : "+max);
	}

}

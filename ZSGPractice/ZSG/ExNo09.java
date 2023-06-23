package com.zsg.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExNo09 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size1 : ");
		int size1=sc.nextInt();
		System.out.println("Enter Size2 : ");
		int size2=sc.nextInt();
		int[] arr1=new int[size1];
		System.out.println("Enter array one values : ");
		for(int i=0;i<size1;i++)
			arr1[i]=sc.nextInt();
		System.out.println(Arrays.toString(arr1));
		int[] arr2=new int[size2];
		System.out.println("Enter array two values : ");
		for(int j=0;j<size2;j++)
			arr2[j]=sc.nextInt();
		System.out.println(Arrays.toString(arr2));
		ArrayList<Integer> ans=new ArrayList<Integer>();
		mergeArray(arr1,arr2,ans);
	}

	static void mergeArray(int[] arr1,int[] arr2,ArrayList<Integer> ans)
	{
		int length=arr1.length>arr2.length?arr1.length:arr2.length;
		int n=arr1.length>arr2.length?0:1;
		int i=0,j=0;
		for(i=0,j=0;i<arr1.length && j<arr2.length;)
		{
			System.out.println(arr1[i]+" "+arr2[j]);
			if(arr1[i]==arr2[j])
			{
				ans.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j])
			{
				ans.add(arr1[i]);
				i++;
			}
			else
			{
				ans.add(arr2[j]);
				j++;
			}	
		}
		for(int k=(n==0)?i:j;k<length;k++)
		{
			if(n==0)
				ans.add(arr1[k]);
			else
				ans.add(arr2[k]);
		}
		for(int z:ans)
		{
			System.out.print(z+" ");
		}
		
	}
	
}

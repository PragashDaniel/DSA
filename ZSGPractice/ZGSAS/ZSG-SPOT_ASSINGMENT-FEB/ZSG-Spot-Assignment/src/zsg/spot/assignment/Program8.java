/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsg.spot.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Program8 
{
    public static void main(String[] args) 
    {
        Program8 program=new Program8();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Values : ");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        program.insertionSort(array);
    }
    
    private void insertionSort(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j>0&&array[j-1]>array[j];j--)
            {						
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    
}

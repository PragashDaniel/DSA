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
public class Program6 
{
    public static void main(String[] args) 
    {
        Program6 program=new Program6();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and colum value : ");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        System.out.println("Enter the values : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                 matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        program.rotate(matrix,matrix.length);
    }    

    private void rotate(int[][] matrix, int length) 
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Rotation "+(i+1));
            transpose(matrix,length);
        }        
    }

    private void transpose(int[][] matrix, int length) 
    {
        for(int i=0;i<length;i++)
        {
            for(int j=i;j<length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        reverse(matrix,length);
    }

    private void reverse(int[][] matrix, int length) 
    {
         for(int i=0;i<length;i++)
         {
            swapReverse(matrix[i],length);
         }
    }
    
    private void swapReverse(int matrix[],int length)
    {
        int i=0,j=length-1;
        while(i<j)
        {
            int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;j--;
        }
        System.out.println(Arrays.toString(matrix));
    }
}

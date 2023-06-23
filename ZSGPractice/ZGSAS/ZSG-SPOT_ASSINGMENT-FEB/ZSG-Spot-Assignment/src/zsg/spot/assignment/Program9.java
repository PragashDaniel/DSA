/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsg.spot.assignment;

import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Program9 
{
    public static void main(String[] args) 
    {
        Program9 program=new Program9();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        program.printMat(matrix,n);
    }
    private void printMat(int matrix[][],int n)
    {
        int l = n , i = 0, j = l - 1;
        while (true) 
        {
            if (i>=j) break;
            for (int k=i;k<=j;k++)
            {
                matrix[i][k]=1;
                matrix[k][i]=1;
                matrix[k][j]=1;
                matrix[j][k]=1;
            }
            i+=2;j-=2;
        }
        matrix[i][j] = 1;
        for(int k=0;k<n;k++)
        {
            for(int s=0;s<n;s++)
            {
                System.out.print(matrix[k][s]);
            }
            System.out.println();
        }
    }
    
}

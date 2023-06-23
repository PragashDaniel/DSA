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
public class Program10 
{
    public static void main(String[] args) 
    {
        Program10 program=new Program10();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. Of inputs : ");
        int n=sc.nextInt();
        System.out.println("Enter the elements : ");
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the K : ");
        int k=sc.nextInt();
        program.checkPair(array,k);
    }
    
    private void checkPair(int array[],int k)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if((array[i]+array[j])%k==0)
                {
                    System.out.println(array[i]+" "+array[j]);
                }
            }
        }
    }
    
}

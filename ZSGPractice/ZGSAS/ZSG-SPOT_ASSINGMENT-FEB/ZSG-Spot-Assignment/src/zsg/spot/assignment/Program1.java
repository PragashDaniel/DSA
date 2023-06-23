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
public class Program1 
{
    
    public static void main(String[] args) 
    {
        Program1 p=new Program1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. Of. Costs");
        int n=sc.nextInt();
        System.out.println("Enter the costs : ");
        int cost[]=new int[n];
        for(int i=0;i<n;i++)
        {
            cost[i]=sc.nextInt();
        }
        System.out.println("Enter the m :");
        int m=sc.nextInt();
        p.compute(cost,m,n);
    }

    private void compute(int[] cost, int m,int n) 
    {
        int temp[]=new int[m];
        int index[]=new int[m];
        for(int i=0;i<n;i++)
        {
            int sum=m-cost[i];
            if(temp[sum]==sum)
            {
                System.out.println("Cost : "+temp[sum]+" "+cost[i]);
                System.out.println("Index :"+(index[temp[sum]]+1)+" "+(i+1) );
            }
            temp[cost[i]]=cost[i];
            index[cost[i]]=i;
        }
    }
}

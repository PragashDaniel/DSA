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
public class Program3 
{
    public static void main(String[] args) 
    {
        Program3 program=new Program3();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
        System.out.println("Enter Trailing Days : ");
        int trailingDays=sc.nextInt();
        System.out.println("Enter the expenditures : ");
        int expenditure[]=new int[n];
        for(int i=0;i<n;i++)
        {
            expenditure[i]=sc.nextInt();
        }
        program.hackerLand(expenditure,trailingDays);
    }
    
    private void hackerLand(int []expenditure,int trailingDays)
    {
        float sum=0;
        for(int i=0;i<trailingDays;i++)
        {
            sum+=expenditure[i];
        }
        float amountSpend=(sum/trailingDays)*2;
        int ans=0;
        for(int i=trailingDays;i<expenditure.length;i++)
        {
            if(amountSpend<=expenditure[i])
                ans++;
        }
        System.out.println(ans);
    }
}

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
public class Program2 
{
    public static void main(String[] args) 
    {
        Program2 program=new Program2();
        Scanner sc=new Scanner(System.in);
        System.out.println("No of inputs : ");
        int n=sc.nextInt();
        System.out.println("Enter the values : ");
        String values[]=new String[n];
        for(int i=0;i<n;i++)
        {
            values[i]=sc.next();
        }
        String newValues[]=program.addingDash(values);
        program.countSort(newValues);
    }
    
    private String[] addingDash(String values[])
    {
        String newValues[]=new String[values.length];
        for(int i=0;i<values.length/2;i++)
        {
            newValues[i]=values[i].charAt(0)+"-";
        }
        for(int i=values.length/2;i<values.length;i++)
        {
            newValues[i]=values[i];
        }
       // System.out.println(Arrays.toString(newValues));
        return newValues;
    }
    private void countSort(String[] values)
    {
       int count[]=count(values);
       sort(values,count);
    }
    
    private void sort(String values[],int count[])
    {
        String sorted[]=new String[values.length];
        for(int i=values.length-1;i>=0;i--)
        {
            sorted[--count[values[i].charAt(0)-'0']]=values[i];
        }
        for(int i=0;i<sorted.length;i++)
        {
            System.out.print(sorted[i].substring(1)+" ");
        }
    }
    
    private int[] count(String values[])
    {
        int count[]=new int[10];
        for(int i=0;i<values.length;i++)
        {
            count[(values[i].charAt(0))-'0']++;
        }
        for(int i=1;i<count.length;i++)
        {
            count[i]=count[i]+count[i-1];
        }
       // System.out.println(Arrays.toString(count));
        return count;
    }
}

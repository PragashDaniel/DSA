/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsg.practice;

import static com.zsg.practice.ExNo90.swap;
import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class ExNo92 
{
    public static void main(String[] args) 
    {
        String arr[]= {"Pragash","Daniel","Shiva","Mahadev","Guru","pragash"};
        sort2(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort1(String []arr,int i) 
    {
         if(i==arr.length)
             return;
         for(int j=i+1;j<arr.length;j++)
         {
            if(arr[i].charAt(0)>arr[j].charAt(0))
                swap(i,j,arr);
         }
         sort1(arr,++i);
    }
    
    static void sort2(String[] arr,int i)
    {
        if(i==arr.length)
            return;
        sort(arr,i,i+1);
        sort2(arr,++i);
    }
    static void sort(String[] arr,int i,int j)
    {
        if(j>=arr.length)
            return;
        if(arr[i].charAt(0)>arr[j].charAt(0))
            swap(i,j,arr);
        sort(arr,i,++j);
        
    }
}

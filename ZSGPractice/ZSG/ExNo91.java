/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsg.practice;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class ExNo91 
{
    public static void main(String[] args) 
    {
        String str="daniel";
        sort1(str);
        sort2(str);
    }
    
    static void swap(int i,int j,char[] arr)
    {
	char temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
    }
    static void sort2(String str)
    {
        char[] ch=str.toLowerCase().toCharArray();
        Arrays.sort(ch);
        reverse(ch);
        System.out.println(ch);
    }
    
    static void reverse(char[] arr)
    {
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            swap(i,j,arr);
        }
    }
    
    static void sort1(String str)
    {
        char[] ch=str.toLowerCase().toCharArray();
        for(int i=0;i<str.length();i++)
        {
            for (int j = i+1; j < str.length(); j++) 
            {
                if(ch[i]<ch[j])
                    swap(i,j,ch);
            }
        }
        System.out.println(ch);
    }
}

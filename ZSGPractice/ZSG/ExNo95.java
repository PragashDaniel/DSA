/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsg.practice;

import static com.zsg.practice.ExNo91.swap;

/**
 *
 * @author ADMIN
 */
public class ExNo95 
{
    public static void main(String[] args) 
    {
        String str="racecar";    
        check1(str);
        check2(str);
    }
     
    static void check1(String str)
    {
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(arr[i]!=str.charAt(i))
            {
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
    
    static void check2(String str)
    {
        for(int i=0,j=str.length()-1;i<j;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
    
    static void reverse(char[] arr)
    {
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            swap(i,j,arr);
        }
    }
}

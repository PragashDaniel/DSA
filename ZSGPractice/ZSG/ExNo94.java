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
public class ExNo94 
{
    public static void main(String[] args) 
    {
        String str1="grab";
        String str2="brag";
        check1(str1,str2);
        check2(str1,str2);
    }
    
    static void check1(String str1,String str2)
    {
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) 
        {
            if(ch1[i]!=ch2[i])
            {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
    
    static void check2(String str1,String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int count[]=new int[26];
        for (int i = 0; i < str1.length(); i++) 
        {
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
            {
                System.out.println("Not Anagram");
                return;
            }
        }    
        System.out.println("Anagram");
    }
}

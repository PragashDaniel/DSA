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
public class ExNo93 
{
    public static void main(String[] args) 
    {
        String str="dani";
        char[] ch=str.toLowerCase().toCharArray();
        //sort1(ch,0);
        sort(ch);
        System.out.println(ch);
    }
   
    static void sort1(char[] ch,int i)
    {
        if(i==ch.length)
            return;
         sort(ch,i,i+1);
         sort1(ch,++i);
         
    }
    static void sort(char[] ch,int i,int j)
    {
        if(j>=ch.length)
            return;
        if(ch[i]<ch[j])
            swap(i,j,ch);
        sort(ch,i,++j);
    }
    
    static void sort(char[] ch)
    {
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]<ch[j])
                    swap(i,j,ch);
            }
        }
        System.out.println(ch);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lps;

import java.util.Arrays;

/**
 *
 * @author welcome
 */
public class LPS 
{
    public static void main(String[] args) 
    {
        String str="abcabcab";//0 0 0 1 2 3 1 2           
        //[0, 0, 0, 0, 0, 1, 1, 1, 2, 3, 4, 5, 6, 7, 2]
        lps(str,str.length());
    }
    static void lps(String str,int n)
    {
        int lps[]=new int[n];
        int i=0,j=1,max=0;
        while(j<n)
        {
            if(str.charAt(i)==str.charAt(j))
            {lps[j]=++i;
             if(max<lps[j]){max=lps[j];}j++;}
            else
            {if(i==0) {lps[j]=0;j++;}
            else {i=lps[i-1];}}
        }
        System.out.println(Arrays.toString(lps));
        System.out.println(max);
    }
}

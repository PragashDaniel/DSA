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
public class ExNo97 
{
    public static void main(String[] args) {
        String str="Pragash Daniel";
        char ch='D';
        BS1(str.toCharArray(),ch);
        if(BS2(str.toCharArray(),ch,0,str.length()))
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
    
    static void BS1(char[] ch,char word)
    {
        Arrays.sort(ch);
        int front=0,last=ch.length;
        while(last-front>1)
        {
            int mid=(front+last)/2;
            if(ch[mid]==word)
            {
                System.out.println("Found");
                return;
            }
            else if(word>ch[mid])
            {
                front=mid+1;
            }
            else
            {
                last=mid-1;
            }
        }
        System.out.println("Not found");
    }
    
    static boolean BS2(char ar[],char toFind,int low,int high)
    {
        if(low<=high)
        {
            int mid=(low+high)/2;
            if(ar[mid]==toFind)
                return true;
            else if(toFind>ar[mid])
                return BS2(ar,toFind,mid+1,high);
            else
                return BS2(ar,toFind,low,mid-1);
        }
        return false;
    }
}

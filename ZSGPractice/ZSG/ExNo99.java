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
public class ExNo99 
{
    public static void main(String[] args) 
    {
        char[] ch=new char[26];
        for(int i=0,j=97;i<ch.length;i++)
        {
            ch[i]=(char)j++;
        }
        System.out.println(Arrays.toString(ch));
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=(char)(ch[i]-32);
        }
        System.out.println(Arrays.toString(ch));
    }
}

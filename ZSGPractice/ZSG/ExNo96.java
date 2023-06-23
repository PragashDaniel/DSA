/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsg.practice;

/**
 *
 * @author ADMIN
 */
public class ExNo96 
{
    public static void main(String[] args) 
    {
        String str="Pragash Daniel";
        char ch='D';
        //searchLinear1(str,ch);
        recLinearSearch(str,ch);
    }

  static void searchLinear1(String str, char ch) 
  {
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)==ch)
           {
               System.out.println("Character found at index "+i);
               return;
           }
       }
       System.out.println("Character not found");
  }
  
  static void recLinearSearch(String str,char ch)
  {
       search(str,ch,0,str.length());
  }
  
  static void search(String s,char ch,int i,int j)
  {
      if(i==j && s.charAt(i)!=ch)
      {
          System.out.println("Character not found ");
          return;
      }
      if(s.charAt(i)==ch)
      {
          System.out.println("Character found at index : "+i);
          return;
      } 
      
      search(s,ch,++i,j);
  }
}

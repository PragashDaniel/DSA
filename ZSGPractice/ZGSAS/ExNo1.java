/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsg;

import java.util.Stack;

/**
 *
 * @author DP
 */
public class ExNo1 
{
    public static void main(String[] args) 
    {
        String str="(a+b)(a*b)";
        if(check(str))
            System.out.println("valid");
        else
            System.out.println("InValid");
    }
    static boolean check(String str)
    {
        Stack<Character> stack=new Stack<>();
        int check=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                stack.push(str.charAt(i));continue;
            }
            if(str.charAt(i)==')')
            {
                if(!stack.isEmpty())
                {stack.pop();continue;}
                else 
                   return false;
            }
            if(str.charAt(i)>=97 && str.charAt(i)<125 && check==0)
            {
                stack.push(str.charAt(i));
                check=1;
                if(str.charAt(i+1)=='+' || str.charAt(i+1)=='*' || str.charAt(i+1)=='-' || str.charAt(i+1)=='/')
                    continue;
                else
                    return false;
            }
            if(str.charAt(i)>=97 && str.charAt(i)<125 && check==1)
            {
                stack.pop();check=0;
            }
            
        }
        return stack.isEmpty();
    }
       
    
}

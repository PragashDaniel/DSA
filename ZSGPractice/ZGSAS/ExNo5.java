/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsg;

import java.util.HashMap;

/**
 *
 * @author DP
 */
public class ExNo5 
{
    public static void main(String[] args) 
    {
        String str="Hello World please";
        String refString="Help";
        count(str,refString);
    }
    
    static void count(String str,String refString)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            else
                map.put(str.charAt(i),1);
        }
        for(int i=0;i<refString.length();i++)
        {
            System.out.println(refString.charAt(i)+" = "+map.get(refString.charAt(i)));
        }
    }
}

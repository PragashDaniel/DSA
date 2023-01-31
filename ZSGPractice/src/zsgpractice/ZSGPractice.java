/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsgpractice;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author welcome
 */
interface A
{
     //void abs();\\\\\fdejrfxr
     @Override
     abstract String toString();
}
public class ZSGPractice 
{

    /**
     * @param args the command line arguments
     */
    static void add()
    {
        ZSGPractice a=new ZSGPractice()
        {
            //@Override
            public void abs()
            {
                System.out.println("HI");
            }
        }; 
        
    }
    public static void main(String[] args) 
    {
        //add();
        TreeSet set =new TreeSet();
        set.add(1);
        set.add(2);
        set.add(11);
        System.out.println(set);
    }
  
   /* @Override
    public void abs() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author welcome
 */
public class BFKMP 
{
    public static void main(String[] args) 
    {
        String original="abfgcbcfgm";
        String pattern="fgm";  //3
        int startPos=0;int flag=0;
        int i=0,j=0;
        for(i=0,j=0;i<original.length()&&j<pattern.length();)
        {
            if(original.charAt(i)==pattern.charAt(j))
            { if(flag==0)startPos=i;flag=1;i++;j++;}
            else if(flag!=1)
                i++;
            else {
                i=startPos+1;j=0;flag=0;
            }
        }
        if(j==pattern.length()) 
            System.out.println(startPos);
        else System.out.println("-1");
    }
}

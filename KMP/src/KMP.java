
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author welcome
 */
public class KMP 
{
    public static void main(String[] args) 
    {
        String string="aefoaefcdaefcdaed";
        String substring="aefcdaed";
        int lps[]=computeTemproryArray(substring,substring.length());
        System.out.println(knuthMorrisPrattAlgorithm(string,substring,lps));
    }
    public static boolean knuthMorrisPrattAlgorithm(String string, String substring,int[] lps) 
    {
        int i=0,j=0;
        for(i=0,j=0;i<string.length()&&j<substring.length();)
        {
            if(string.charAt(i)==substring.charAt(j))
            {
                i++;j++;
            }
            else{
                if(j==0)
                    i++;
                else
                    j=lps[j-1];}
        }
        return j==substring.length();
    }
    static int[] computeTemproryArray(String substring,int n)
    {
        int lps[]=new int[n];
        lps[0]=0;
        for(int i=0,j=1;j<n;)
        {
            if(substring.charAt(i)==substring.charAt(j))
            {lps[j]=i+1;i++;j++;}
            else
            {if(i==0){lps[j]=0;j++;}
            else{i=lps[i-1];}}
        }
        System.out.println(Arrays.toString(lps));
        return lps;
    }
}

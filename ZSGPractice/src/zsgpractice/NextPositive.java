/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsgpractice;

import java.util.Arrays;

/**
 *
 * @author welcome
 */
public class NextPositive 
{
    public static void main(String[] args) 
    {
        int nums[]={1,2,0};
        Arrays.sort(nums);
        System.out.println(firstMissingPositive(nums));
    }
    

    static public int firstMissingPositive(int[] nums) 
    {
        int n=max(nums);
        for(int i=1;i<n;)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[j]>0){
                    if(nums[j]!=i)
                        return i;
                    else i++;}
                    
            }
        }
        return n+1;
    }
    static int max(int[] num)
    {
        int max=num[0];
        for(int i=1;i<num.length;i++)
        {
            if(max<num[i])
                max=num[i];
        }
        return max;
    }
}
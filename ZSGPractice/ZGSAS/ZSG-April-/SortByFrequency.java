
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author welcome
 */
public class SortByFrequency {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Size of an Array : ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
          array[i] = scanner.nextInt();
        }
        SortByFrequency sortByfrequency=new SortByFrequency();
        sortByfrequency.sortBy(array,N);
    }

    void sortBy(int array[],int N)
    {
        int max=getMax(array);
        int frequency[]=new int[max+1];
        getFrequency(frequency,array);
        sortByFreq(array,frequency);
    }
    
    void sortByFreq(int []array,int []frequency)
    {
        for(int i=0;i<array.length;i++)
        {
            int max[]=getMaxFreq(frequency);
            for(int j=0;j<max[0];j++)
            {
                System.out.print(max[1]+" "); 
            }
            frequency[max[1]]=0;
        }
    }
    
    void getFrequency(int frequency[],int array[])
    {
        for (int i = 0;i<array.length;i++) 
        {
            frequency[array[i]]++;
        }
    }
    
    int getMax(int[] array)
    {
        int max=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(max<array[i]) max=array[i];
        }
        return max;
    }
    
    int[] getMaxFreq(int[] array)
    {
        int max=array[0];
        int index=0;
        for(int i=1;i<array.length;i++)
        {
            if(max<array[i]) {max=array[i];index=i;}
        }
        return new int[]{max,index};
    }
    
}
 

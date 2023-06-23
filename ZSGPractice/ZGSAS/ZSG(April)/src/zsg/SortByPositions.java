/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsg;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class SortByPositions {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("size of array : ");
        int n=scanner.nextInt();
        int[] elements=new int[n];
        for (int i = 0; i < n; i++) {
           elements[i]=scanner.nextInt();
        }
        //elements=new int[]{3,2,1,4,5,6,7,8,9};
        sort(elements,n);
    }

    private static void sort(int[] elements, int n) {
        
        for(int i=0;i<n;i++)
        {
            
            if(i%2==0)
                for(int j=i+2;j<n;j=j+2)
                {
                    if(elements[i]>elements[j])
                        swap(i,j,elements);
                }
            else
                for(int j=i+2;j<n;j=j+2)
                {
                    if(elements[i]<elements[j])
                        swap(i,j,elements);
                }
                
                
        }
        System.out.println(Arrays.toString(elements));
    }

    private static void swap(int i, int j, int[] elements) {
        int temp=elements[i];
        elements[i]=elements[j];
        elements[j]=temp;
    }
}

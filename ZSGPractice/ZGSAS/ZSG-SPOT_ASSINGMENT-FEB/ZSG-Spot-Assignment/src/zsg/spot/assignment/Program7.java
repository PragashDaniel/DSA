
package zsg.spot.assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Program7 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        System.out.println("Enter the elements : ");
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        Program7 program=new Program7();
        program.generateSubSets(array);
    }

    private void generateSubSets(int array[]) 
    {
        ArrayList<Integer> sets=new ArrayList<>();
        ArrayList<ArrayList<Integer>> set=new ArrayList<>();
        set.add(new ArrayList<>());
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    sets.add(array[k]);
                }
                set.add(sets);
                sets=new ArrayList();
            }
        }
        System.out.println(set);
    }
    
}

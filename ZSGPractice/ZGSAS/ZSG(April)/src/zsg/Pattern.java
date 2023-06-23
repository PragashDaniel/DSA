/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsg;

import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Pattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        print(size);
    }

    private static void print(int size) {
       
        for(int i=0;i<size;i++)
        {
            for (int j = 0; j < size; j++) {
                if(i==0|| i==size-1 || j==0 || j==size-1 || i==j || (i+j)==size-1)
                    System.out.print("*");
                else             
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

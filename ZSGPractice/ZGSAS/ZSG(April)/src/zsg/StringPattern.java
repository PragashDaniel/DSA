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
public class StringPattern {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string="ZOHOOOISHIRING";
        int numOfRows=4;
        print(string,numOfRows);
    }

    private static void print(String string,int length) {
        char[][] matrix=new char[length][string.length()];
        boolean down=false;
        
        for(int row=0,col=0,j=0;j<string.length();j++)
        {
            //System.out.println(i+" "+j);
            matrix[row][col]=string.charAt(j);
            if(row==0) down=true;
            if(row==length-1)down=false;
            if(down)
                row++;
            else
            {
                row--;col++;
                down=false;
            }
        }
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

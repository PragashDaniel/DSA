/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudakosolver;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author welcome
 */
public class SudakoSolver 
{
    public static void main(String[] args) 
    {
        int[][] inputValues =
        new int[][] {
          {7, 8, 0, 4, 0, 0, 1, 2, 0},
          {6, 0, 0, 0, 7, 5, 0, 0, 9},
          {0, 0, 0, 6, 0, 1, 0, 7, 8},
          {0, 0, 7, 0, 4, 0, 2, 6, 0},
          {0, 0, 1, 0, 5, 0, 9, 3, 0},
          {9, 0, 4, 0, 6, 0, 0, 0, 5},
          {0, 7, 0, 3, 0, 0, 0, 1, 2},
          {1, 2, 0, 0, 0, 7, 4, 0, 0},
          {0, 4, 9, 2, 0, 6, 0, 0, 7}
        };
        new SudakoSolver().fillNumber(inputValues);
        print(inputValues);
    }

    private boolean fillNumber(int[][] board) 
    {
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[0].length;col++)
            {
               if(board[row][col]==0)
                {
                    for(int fill=1;fill<=9;fill++)
                    {
                        if(check(board,row,col,fill))
                        {
                                board[row][col]=fill;
                                if(fillNumber(board))
                                    return true;
                                board[row][col]=0;
                        }
                    }
                    return false;    
                }
            }
        }
        return true;
    }

    boolean check(int board[][],int row,int col,int fill)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==fill)
                return false;
            if(board[i][col]==fill)
                return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==fill)
                return false;
        }
        return true;
    }
    
    private boolean checkRow(int[][] board, int row,char n) {
        for(int col=0;col<board[0].length;col++)
        {
            if(board[row][col]==n) return false;
        }
        return true;
    }

    private boolean checkCol(int[][] board, int col,char n) {
        for(int row=0;row<board.length;row++)
        {
            if(board[row][col]==n) return false;
        }
        return true;
    }

    private boolean checkSubBox(int[][] board, int row, int col,char n) 
    {     
        int start=row-row%3;
        int colStart=col-col%3;
        for(int i=start;i<start+3;i++)
        {
            for(int j=colStart;j<colStart+3;j++)
            {
                if(board[i][j]==n)
                    return false;
            }
        }
        return true;
    }

    private static void print(int[][] board) {
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[0].length;col++)
            {
                System.out.print(board[row][col]+" \t");
            }
            System.out.println();
        }
    }
    
    
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author welcome
 */
public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of an Array : ");
        int N = scanner.nextInt();
        int matrix[][]=new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        antiDiagonals(matrix,N);
    }

    private static void antiDiagonals(int[][] matrix, int N) {
        List<ArrayList> ans=new ArrayList<>();
        boolean[][] visited=new boolean[N][N];
        for(int i=0;i<N;i++)
        {
            ArrayList<Integer> temp=null;
            for (int j = 0; j <N; j++) {
                temp=new ArrayList<>(); 
            fill(matrix,temp,i,j,visited);
            if(!temp.IsEmpty())
                ans.add(temp);
        }
        }
        System.out.println(ans);
    }
    
    private static void fill(int[][] matrix,ArrayList<Integer> temp,int i,int j,boolean[][] visited)
    {
            
            if(i>=matrix.length || j<0 || visited[i][j]==true) return;
            visited[i][j]=true;
            temp.add(matrix[i][j]);
            fill(matrix,temp,i+1,j-1,visited);
            
    }
}

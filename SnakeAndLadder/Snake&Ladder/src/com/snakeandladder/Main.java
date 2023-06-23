/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snakeandladder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of palyers : ");
        
        int nop = sc.nextInt();
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < nop; i++) {
            System.out.println("Enter the name of the player " + (i + 1) + " : ");
            String name = sc.next();
            players.add(new Player(name, 1));
        }
        SnakeAndLadderSetUp sl=snakeAndLadderSetUp();
        Game game = new Game(sl.snakes,sl.ladders);
        game.start(players);
    }

    private static SnakeAndLadderSetUp snakeAndLadderSetUp() {
        HashSet<String> checkDuplicates=new HashSet<>();
        System.out.println("Enter the number of Snakes : ");
        int nos=sc.nextInt();
        List<Snake> snakes=new ArrayList();
        for(int i=0;i<nos;i++)
        {
            System.out.println("Enter the head position : ");
            int head=sc.nextInt();
            System.out.println("Enter the tail position : ");
            int tail=sc.nextInt();
            String position=String.valueOf(head)+tail;
            if(head<tail || head>99 || tail<1){System.out.println("Invalid input..");i--;}
            else{
                if(checkDuplicates.contains(position))
                {
                    System.out.println("Duplicate Entry...");i--;
                }
                else{
                    checkDuplicates.add(position);
                    snakes.add(new Snake(head,tail));
                }
            }
        }
        
        System.out.println("Enter the number of Ladders : ");
        int nol=sc.nextInt();
        List<Ladder> ladders=new ArrayList();
        for(int i=0;i<nol;i++)
        {
            System.out.println("Enter the start position : ");
            int start=sc.nextInt();
            System.out.println("Enter the end position : ");
            int end=sc.nextInt();
            String position=end+String.valueOf(start);
            if(start>end || start>100 || end<1){System.out.println("Invalid input..");i--;}
            else{ 
                if(checkDuplicates.contains(position))
                {
                    System.out.println("Duplicate Entry...");i--;
                }
                else{
                    checkDuplicates.add(position);
                    ladders.add(new Ladder(start,end));
                }
            }
        }
        SnakeAndLadderSetUp snakeLadder=new SnakeAndLadderSetUp();
        snakeLadder.ladders=ladders;
        snakeLadder.snakes=snakes;
        return snakeLadder;
    }
    
    static class SnakeAndLadderSetUp
    {
        List<Snake> snakes;
        List<Ladder> ladders;
    }
    
}

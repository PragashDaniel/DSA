/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snakeandladder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author welcome
 */
public class Game {

    private final int BOARD_SIZE=100;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Dice dice;
    private Queue<Player> player;
    Game(List<Snake> snakes,List<Ladder> ladders)
    {
        this.snakes=snakes;
        this.ladders=ladders;
        this.dice=new Dice();
        player=new LinkedList<>();
    }
    void start(List<Player> players) {
        addPlayers(players);
        while(true)
        {
            int diceRolledNo=0;
            Player p=player.poll();
            if(!p.isStatus()) {
                diceRolledNo=dice.roll();
                System.out.println(p.getName()+" Dice Rotated No : "+diceRolledNo);
            }
            if(diceRolledNo==1 || p.isStatus())
            {
               if(gameStarted(p))
                   break;
            }   
            else
                System.out.println("Not entered into the game...");
            player.add(p);
            if(this.player.size()<1){
                System.out.println("Match Ended...");return;}
        }
    }

    
    private void addPlayers(List<Player> players) {
        for(Player player:players)
        {
            this.player.add(player);
        }
    }

    private boolean gameStarted(Player p) {
        int currentPosition=p.getPosition();
        System.out.println(p.getName()+" at position "+(currentPosition));
        int diceRolledNo=dice.roll();
        System.out.println(p.getName()+"Dice Rotated No : "+diceRolledNo);
        p.setPosition(currentPosition+diceRolledNo);
        if(BOARD_SIZE==p.getPosition())
        {
            System.out.println("Winner is "+p.getName());
            this.player.poll();
            return true;
        }
        if(p.getPosition()>BOARD_SIZE)
        {
            p.setPosition(currentPosition);
            System.out.println("Invalid Move...");
            return false;
        }
        check(p);  
        System.out.println(p.getName()+" Current Position = "+p.getPosition());
        if(!p.isStatus())p.setStatus(true);
        return false;
    }

    private void check(Player player) {
        for(int i=0;i<snakes.size();i++)
        {
            if(snakes.get(i).getHead()==player.getPosition())
            {
                System.out.println("Snake Bitten ...");
                player.setPosition(snakes.get(i).getTail());
            }
        }
        for(int i=0;i<ladders.size();i++)
        {
            if(ladders.get(i).getStart()==player.getPosition())
            {
                System.out.println("Getten Ladder...");
                player.setPosition(ladders.get(i).getEnd());
            }
        }
    }
    
}

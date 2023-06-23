/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snakeandladder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Game {
    Board board;
    Dice dice;
    Queue<Player> players;
    GameStatus status;
 
    public Game(Board board, Dice dice)
    {
        this.board = board;
        this.dice = dice;
        this.players = new LinkedList<Player>();
        this.status = GameStatus.NOT_STARTED;
    }
 
    public void startGame()
    {
        this.status = GameStatus.RUNNING;
        board.printBoard();
        System.out.println("Size : "+players.size());
        // Run until we have only 1 player left on the board
        while(players.size() > 1)
        {
            Player player = players.poll();
 
            makeMove(player);
 
            if(player.getPosition() == board.getTotalCells())
                System.out.println(player.getName() + " has completed the game!");
            else
                players.add(player);
        }
 
        this.status = GameStatus.FINISHED;
 
    }
 
    private void makeMove(Player player) {
 
        System.out.println();
        System.out.println(player.getName()+"'s turn.");
        System.out.println("Press anything to roll the dice.");
 
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
 
        int playerPosition = player.getPosition();
        int rollValue = dice.roll();
 
        int targetPosition = playerPosition + rollValue;
 
        if(targetPosition > board.getTotalCells())
            System.out.println("Invalid Move");
        else
        {
            if(board.hasSpecialEntity(targetPosition))
            {
                targetPosition = board.getSpecialEntity(targetPosition).getEndPosition();
            }
        }
 
        player.setPosition(targetPosition);
 
    }
 
    public void addPlayers(List<Player> all_players) throws Exception
    {
        if(this.status == GameStatus.NOT_STARTED)
        {
            for(Player player : all_players)
                this.players.add(player);
        }
        else
            throw new GameAlreadyStartedException("Can't add players after game started");
 
    } 
}

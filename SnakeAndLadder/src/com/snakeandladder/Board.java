/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snakeandladder;

import java.util.HashMap;

/**
 *
 * @author welcome
 */
public class Board {
    int dimension;
 
    HashMap<Integer, SpecialEntity> specialEntities=new HashMap<>();
 
    public Board(int dimension)
    {
        this.dimension = dimension;
    }
 
    public void printBoard()
    {
        int totalCells = dimension*dimension;
        for(int i=totalCells; i > 0; i--)
        {
            System.out.print(" | " + i + " ");       
            if(hasSpecialEntity(i))
                System.out.print(specialEntities.get(i).getID());
 
            System.out.print(" |");
            if(totalCells % 10 == 0)
                System.out.println();
        }
    }
 
    public int getTotalCells()
    {
        return this.dimension * this.dimension;
    }
 
    public void addSpecialEntity(SpecialEntity entity)
    {
        int actionPosition = entity.getActionPosition();
 
        specialEntities.put(actionPosition, entity);
    }
 
    public boolean hasSpecialEntity(int position)
    {
        return specialEntities.containsKey(position);
    }
 
    public SpecialEntity getSpecialEntity(int position)
    {
        if(hasSpecialEntity(position))
            return specialEntities.get(position);
 
        return null;
    }
}

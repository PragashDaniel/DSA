/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snakeandladder;

/**
 *
 * @author welcome
 */
public abstract class SpecialEntity{
   
    private int start;
    private int end;
   
    public SpecialEntity(int start, int end) {
        this.start = start;
        this.end = end;
    }
 
    public abstract String getID();
 
    public int getActionPosition()
    {
        return this.start;
    }
 
    public int getEndPosition()
    {
        return this.end;
    }
}
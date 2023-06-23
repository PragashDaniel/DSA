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
public class Dice {
    int maxValue;
 
    public Dice(int maxVal)
    {
        this.maxValue = maxVal;
    }
 
    public int roll()
    {
        System.out.println((int) Math.floor(Math.random()*maxValue + 1));
        return (int) Math.floor(Math.random()*maxValue + 1);
    }
}

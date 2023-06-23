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
public class Snake extends SpecialEntity{
 
    public Snake(int start, int end) {
        super(start, end);
    }
 
    @Override
    public String getID() {
        return "S_"+ this.getEndPosition();
    } 
}

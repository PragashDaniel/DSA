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
public class Snake {
    private int head;
    private int tail;
    
    Snake(int head,int tail)
    {
        this.head=head;
        this.tail=tail;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }
    
    
}

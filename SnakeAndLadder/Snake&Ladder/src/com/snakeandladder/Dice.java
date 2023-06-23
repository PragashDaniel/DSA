/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snakeandladder;

import java.util.Random;

/**
 *
 * @author welcome
 */
public class Dice {

    int roll() {
        return new Random().nextInt(6)+1;
    }
   
}

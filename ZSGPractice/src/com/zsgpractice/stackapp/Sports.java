/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsgpractice.stackapp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author welcome
 */
public class Sports 
{
    public static void main(String[] args) 
    {
        Sports obj=new Sports();
        obj.page1();
    }
    void page1()
    {
        Stack<ArrayList<String>> stack=new Stack<>();
        ArrayList<String> list=new ArrayList<>();
        list.add("1)Hockey");
        list.add("2)FootBall");
        list.add("3)VolleyBall");
        list.add("4)BasketBall");
        for(String lst:list)
        {
            System.out.println(lst);
        }
        stack.push(list);    
        page2(stack);
    }
    void page2(Stack<ArrayList<String>> stack)
    {
        System.out.println("Enter the sport name to continue : ");
        Scanner sc=new Scanner(System.in);
        String sport=sc.next().toLowerCase().trim();
        if(sport.equals("hockey"))
        {
            getHockeyDetails(stack);
        }
        else if(sport.equals("football"))
        {
            getFootBallDetails(stack);
        }
        else if(sport.equals("volleyball"))
        {
            getVolleyBallDetails(stack);
        }
        else if(sport.equals("basketball"))
        {
            getBasketBallDetails(stack);
        }
        else if(sport.equals("exit"))
        {
            stack.pop();
        }
    }
    
    void getHockeyDetails(Stack<ArrayList<String>> stack)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("1)Hockey Sticks");
        list.add("2)Hockey Shoes");
        list.add("3)Leg Pad");
        list.add("4)Hockey Socks");
        list.add("5)Stick Bags");
        list.add("6)Back");
        for(String lst:list)
        {
            System.out.println(lst);
        }
        stack.push(list);
        page3(stack);
        
    }
    void getFootBallDetails(Stack<ArrayList<String>> stack)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("1)FootBall");
        list.add("2)FootBall Shoes");
        list.add("3)FootBall Leg Pad");
        list.add("4)FootBall Socks");
        list.add("5)FootBall Bags");
        list.add("6)Back");
        for(String lst:list)
        {
            System.out.println(lst);
        }
        stack.push(list);
        page3(stack);
    }
    void getBasketBallDetails(Stack<ArrayList<String>> stack)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("1)BasketBall");
        list.add("2)BasketBall Shoes");
        list.add("3)Mouth Gaurd");
        list.add("4)BasketBall Socks");
        list.add("5)Bags");
        list.add("6)Back");
        for(String lst:list)
        {
            System.out.println(lst);
        }
        stack.push(list);
        page3(stack);
    }
    void getVolleyBallDetails(Stack<ArrayList<String>> stack)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("1)VolleyBall");
        list.add("2)VolleyBall Shoes");
        list.add("3)Hair Band");
        list.add("4)VolleyBall Socks");
        list.add("5)Face Gaurd");
        list.add("6)Back");
        for(String lst:list)
        {
            System.out.println(lst);
        }
        stack.push(list);
        page3(stack);
    }
    void page3(Stack<ArrayList<String>> stack)
    {
        System.out.println("Enter the category name to continue : ");
        Scanner sc=new Scanner(System.in);
        String category=sc.next().toLowerCase().trim();
        if(category.equals("hockey sticks"))
        {
            getStickDetails(stack);
        }
        else if(category.equals("hockey shoes"))
        {
            getHockeyShoesDetails(stack);
        }
        else if(category.equals("leg pad"))
        {
            getHockeyLegPadDetails(stack);
        }
        else if(category.equals("hockey socks"))
        {
            getHockeySocksDetails(stack);
        }
        else if(category.equals("stick bags"))
        {
            getStickBags(stack);
        }
        if(category.equals("football"))
        {
            getBallDetails(stack);
        }
        else if(category.equals("football shoes"))
        {
            getFootBallShoesDetails(stack);
        }
        else if(category.equals("football leg pad"))
        {
            getFootBallLegPadDetails(stack);
        }
        else if(category.equals("football socks"))
        {
            getFootBallSocksDetails(stack);
        }
        else if(category.equals("football bags"))
        {
            getFootBallBags(stack);
        }
        if(category.equals("volleyball"))
        {
            getVolleyBallBallDetails(stack);
        }
        else if(category.equals("volleyball shoes"))
        {
            getVolleyBallShoesDetails(stack);
        }
        else if(category.equals("hair bands"))
        {
            getVolleyBallHeadBandsDetails(stack);
        }
        else if(category.equals("volleyball socks"))
        {
            getVolleyBallSocksDetails(stack);
        }
        else if(category.equals("face gaurd"))
        {
            getVolleyBallFaceGaurds(stack);
        }
        if(category.equals("volleyball"))
        {
            getVolleyBallBallDetails(stack);
        }
        else if(category.equals("volleyball shoes"))
        {
            getVolleyBallShoesDetails(stack);
        }
        else if(category.equals("hair bands"))
        {
            getVolleyBallHeadBandsDetails(stack);
        }
        else if(category.equals("volleyball socks"))
        {
            getVolleyBallSocksDetails(stack);
        }
        else if(category.equals("face gaurd"))
        {
            getVolleyBallFaceGaurds(stack);
        }
        if(category.equals("back"))
        {
            stack.pop();
            page1();
        }
    }
}

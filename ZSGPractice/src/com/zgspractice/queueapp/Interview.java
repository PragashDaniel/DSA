/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zgspractice.queueapp;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Interview 
{
    Scanner sc=new Scanner(System.in);
    private final int LIMIT=5,int candidate=0,waitList=0;
    private Queue<Integer> queue=new LinkedList<>();
    private Queue<Integer> queueWaitList=new LinkedList<>();
    public static void main(String[] args) 
    {
        
        Interview interview=new Interview();
        interview.page1();
    }
    private void page1()
    {
        while(true){
        System.out.println("1) Enter new Candidate press 1 or 0 to stop");
        System.out.println("2) No. of. Seats available press 2");
        System.out.println("3) Press 3 if Interview gets finished");
        int n=sc.nextInt();
        if(n==3)
        {
            finished();continue;
        }
        if(n==2)
        {
            System.out.println(5-candidate);continue;
        }   
        
            if(n==1)
                allow();
            else
                break;}
    }
    private void allow()
    {
        if(candidate<5)
        {
            queue.add(candidate++);
            System.out.println(5-candidate+" Candidate can come inside");
        }
        else
        {
            System.out.println("Limit reached and you moved to waiting list ");
            queueWaitList.add(waitList++);
        }
    }
    private void finished()
    {
        queue.remove();
        if(!queueWaitList.isEmpty()){
        int person=queueWaitList.remove();
        queue.add(person);waitList--;}

        if(waitList==0) 
            System.out.println("No one is in wait state");
        else 
            System.out.println(waitList+" people in waitinglist");
    }
}

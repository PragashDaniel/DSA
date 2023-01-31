/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;


class Node
{
    int data;Node next;
}
public class LinkedList 
{
    Node head;
    void insert(int data)
    {
        Node obj=new Node();
        obj.data=data;
        if(head==null)
            head=obj;
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=obj;
        }
    }
    void delete(int val)
    {
        Node temp=head,prev=head;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                prev.next=temp.next;
            }
            prev=temp;
            temp=temp.next;
        }
    }
    void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) 
    {
        LinkedList list=new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.delete(4);
        list.print();
    }
    
}

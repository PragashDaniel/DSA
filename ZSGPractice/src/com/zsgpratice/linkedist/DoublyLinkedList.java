/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoublyLinkedList;

class Node
{
    Node prev,next;
    int data;
}
public class DoublyLinkedList 
{
    Node head;Node tail;
    void add(int data)
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
            obj.prev=temp;
            tail=obj;
        }
     }
    
    void delete(int val)
    {
        Node temp=head,prev=head;
        while(temp.data!=val)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        temp=temp.next;
        if(temp!=null)
        temp.prev=prev;
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
    void printReverse()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }
    
    public static void main(String[] args) 
    {
        DoublyLinkedList list=new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //list.delete(5);
        list.print();
        list.printReverse();
    }
}

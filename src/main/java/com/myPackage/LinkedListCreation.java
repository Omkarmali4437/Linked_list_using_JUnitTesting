package com.myPackage;

public class LinkedListCreation<T extends Comparable<T>> {

    class Node<T>
    {
        T data;
        Node next;

        public Node(T data)
        {
            this.data=data;
            this.next=next;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addValue(T data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
    }

    public void insertatFirst(T data)
    {
        Node newnode1=new Node(data);
        if(head==null)
        {
            head=newnode1;
            tail=newnode1;
        }
        else
        {
            Node node1=head;
            head=newnode1;
            head.next=node1;
        }
    }

    public void insertatBack(T data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
    }

    public <T> Node insertatMid(T data, int position)
    {
        Node newnode2=new Node(data);
        newnode2.data=data;
        Node current=head;
        Node oldNode=null;
        int count=0;

        while(count<position)
        {
            oldNode=current;
            current=current.next;
            count++;
        }
        newnode2.next=current;
        while(oldNode != null)
        {
            oldNode.next=newnode2;
            return head;
        }
        return newnode2;
    }

    public void display()
    {
        Node current=head;
        int size=0;

        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        else
        {
            System.out.println("Values of list are: ");
            while(current!=null)
            {
                System.out.println(current.data+" ");
                size++;
                current=current.next;
            }
            System.out.println("List size is: "+size);
        }
    }

}

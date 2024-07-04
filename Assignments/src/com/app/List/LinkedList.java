package com.app.List;

public class LinkedList {
    
    Node head;
    Node tail;
    int size;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    void addAtFirst(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        if(size==1){
            tail=head;
            tail.next=null;
        }
        head = newNode;
        size++;
    }

    int deleteAtLast(){
        Node pointer=head;
        if(size==0){
            System.out.println("List is empty");
        }
        while(pointer.next==tail){
            pointer=pointer.next;
        }
        int data=tail.data;
        tail=pointer;
        tail.next=null;
        size--;
        return data;
    }

    void show(){
        Node pointer=head;
        while(pointer!=null){
            System.out.print(pointer.data+" -> ");
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtFirst(10);
        list.addAtFirst(20);
        list.addAtFirst(30);
        list.show();
       // System.out.println(list.deleteAtLast());
    }
}


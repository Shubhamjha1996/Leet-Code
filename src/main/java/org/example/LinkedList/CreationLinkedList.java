package org.example.LinkedList;

public class CreationLinkedList {

    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);

        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=null;

        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }

    public  static  void traverse(Node head){
        Node cur=head;
        while(cur==null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
}

class Node<T>{
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
    }
}

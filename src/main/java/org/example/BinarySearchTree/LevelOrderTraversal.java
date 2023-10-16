package org.example.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node1 root=createTree();
        printLevelOrder(root);

    }

    public static void printLevelOrder(Node1 root){
        Queue<Node1> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node1 cur=q.poll();
            System.out.print(cur.data);
            if(cur.left != null){
                q.add(cur.left);
            }
            if(cur.right != null){
                q.add(cur.right);
            }
        }
    }

    public static Node1 createTree(){
        Node1 root=null;
        System.out.println("Enter the data:");
        int data=sc.nextInt();
        if(data==-1) return null;
        root=new Node1(data);
        System.out.println("Enter data for left:"+data);
        root.left=createTree();
        System.out.println("Enter data for right:"+data);
        root.right=createTree();
        return root;
    }


}
 class Node1{
    Node1 left,right;
    int data;
     public Node1(int data){
         this.data=data;
     }
 }
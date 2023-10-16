package org.example.BinarySearchTree;

import java.util.Scanner;

public class CreateTreeAndTraversal {

    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }

    public static Node createTree() {
        Node root = null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if (data == -1) return null;
        root = new Node(data);
        System.out.println("Enter data for left:" + data);
        root.left = createTree();
        System.out.println("Enter data for right:" + data);
        root.right = createTree();
        return root;
    }

    static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);//left
        System.out.print(root.data);//root
        inOrder(root.right);//right node
    }

//    //to add in list and return a list--leetcode
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ans=new ArrayList<>();
//        helper(root,ans);
//        return ans;
//    }
//
//    private void helper(TreeNode node,List<Integer> ans){
//        if(node == null) return;
//        helper(node.left,ans);
//        ans.add(node.val);
//        helper(node.right,ans);
//    }


    static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data);//node
        preOrder(root.left);//left
        preOrder(root.right);//right
    }

    static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);//left
        postOrder(root.right);//right
        System.out.print(root.data);//node
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

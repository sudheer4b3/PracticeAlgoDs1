package com.ssk.algo.BinaryTrees;

public class BST {


    public Node addNode(int data, Node head){
        Node tempHead = head;
        Node newNode = new Node();
        newNode.data = data;
        if(head == null){
            return newNode;
        }

        Node prev=null;
        while (head != null){
            prev= head;
            if(data < head.data){
                head = head.left;
            }
            else{
                head = head.right;
            }

        }

        if(prev.data < data) {
            prev.right = newNode;
        }
        else {
            prev.left = newNode;
        }

        return tempHead;


    }

    public int height (Node head){

        if(head == null){
            return 0;
        }

        int leftHeight = height(head.left);
        int rightHeight =  height(head.right);
        return 1 + Math.max(leftHeight,rightHeight);
    }

    public Node search(Node root, int key){

      if(root == null){
          return null;
      }
      if(root.data == key){
          return root;
      }
      if(root.data < key){
          return search(root.right,key);
      }
      else{
          return search(root.left,key);
      }

    }


    public static void main(String[] args) {
        BST bt = new BST();
        Node head = null;

        head = bt.addNode(10, head);
        head = bt.addNode(15, head);
        head = bt.addNode(5, head);
        head = bt.addNode(7, head);
        head = bt.addNode(19, head);
        head = bt.addNode(20, head);
        head = bt.addNode(-1, head);
        head = bt.addNode(21, head);

        System.out.println(bt.height(head));

    }
}

class Node {

    int data;
    Node left;
    Node right;

}

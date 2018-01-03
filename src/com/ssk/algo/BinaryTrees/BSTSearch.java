package com.ssk.algo.BinaryTrees;

public class BSTSearch {



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




    public static void main(String args[]){
        BST bt = new BST();
        Node root = null;
        root = bt.addNode(10, root);
        root = bt.addNode(20, root);
        root = bt.addNode(-10, root);
        root = bt.addNode(15, root);
        root = bt.addNode(0, root);
        root = bt.addNode(21, root);
        root = bt.addNode(-1, root);
        BSTSearch bstSearch = new BSTSearch();
        Node result = bstSearch.search(root, 21);
        assert result.data == 21;

        result = bstSearch.search(root, 21);
        assert result.data == 21;
        System.out.println(result == null);

        result = bstSearch.search(root, 11);
        assert result == null;
    }
}

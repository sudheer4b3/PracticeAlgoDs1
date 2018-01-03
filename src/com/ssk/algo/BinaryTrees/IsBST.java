package com.ssk.algo.BinaryTrees;

public class IsBST {


    boolean isBST(Node root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.data < min || root.data >= max){
            return false;
        }

        return isBST(root.left,min,root.data) &&  isBST(root.right,root.data,max);

    }
}

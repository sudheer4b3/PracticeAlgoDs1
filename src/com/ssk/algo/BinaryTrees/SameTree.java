package com.ssk.algo.BinaryTrees;

public class SameTree {



    boolean sametree(Node root1,Node root2){

        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        return root1.data == root2.data &&
                sametree(root1.left,root2.left)&& sametree(root1.right,root2.right);
    }
}

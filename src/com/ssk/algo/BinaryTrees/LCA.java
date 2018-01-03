package com.ssk.algo.BinaryTrees;

public class LCA {

//BST
    Node LCABst(Node root , int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.data > Math.max(n1,n2)){
            return (root.left,n1,n2);
        }
        if(root.data < Math.min(n1,n2)){
            return (root.right,n1,n2);
        }
        return  root;

    }


    // binary tree
    Node LCABT(Node root , Node n1, Node n2){
        if(root == null){
            return null;
        }
        if(root == n1 || root == n2){
            return root;
        }

        Node left = LCABT( root.left ,  n1,  n2);
        Node right = LCABT( root.right ,  n1,  n2);

        if(left != null && right != null){
            return root;
        }
        if(left == null && right == null){
            return null;
        }


        return  left == null ? right :left;

    }


    public Node getParentNode(Node root, Node node) {


        if (null == root)
            return null;

        if (root.left == node || root.right == node)
            return root;

        Node lh = getParentNode(root.left, node);
        Node rh = getParentNode(root.right, node);

        return lh != null ? lh : rh;

    }

    boolean printAncestors(Node node, int target)
    {
         /* base cases */
        if (node == null)
            return false;

        if (node.data == target)
            return true;

        /* If target is present in either left or right subtree
           of this node, then print this node */
        if (printAncestors(node.left, target)
                || printAncestors(node.right, target))
        {
            System.out.print(node.data + " ");
            return true;
        }

        /* Else return false */
        return false;
    }


}

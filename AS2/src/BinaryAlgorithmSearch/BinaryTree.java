/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryAlgorithmSearch;


import BT.NodeBT;


/**
 *
 * @author CltControl
 */
public class BinaryTree<E> {

    private NodeBT<E> root;


    public BinaryTree() {
        this.root = null;

    }

    public NodeBT<E> getRoot() {
        return root;
    }

    public void setRoot(E root) {
        this.root = new NodeBT<>(root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean add(E child, E parent) {
        NodeBT<E> NodeChild = new NodeBT<>(child);
        if (child == null) {
            return false;
        } else if (parent == null || isEmpty()) {
            root = NodeChild;
            return true;
        } else if (parent != null) {
            if (SearchNode(child) == null) {
                NodeBT<E> Np = SearchNode(parent);
                if (Np == null || (Np.getLeft() != null && Np.getRight() != null)) {
                    return false;
                } else if (Np.getLeft() == null) {
                    Np.setLeft(NodeChild);
                } else {
                    Np.setRight(NodeChild);
                }
                return true;
            }
        }
        return false;

    }

    public NodeBT<E> SearchNode(E data) {
        if (data == null || isEmpty()) {
            return null;
        }
        return SearchNode(data, root);
    }

    private NodeBT<E> SearchNode(E Data, NodeBT<E> n) {
        if (n == null) {
            return null;
        } else if (n.getData().equals(Data)) {
            return n;
        } else {
            NodeBT<E> L = SearchNode(Data, n.getLeft());
            return (L != null) ? L : SearchNode(Data, n.getRight());

        }

    }

    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(NodeBT<E> n) {
        if (n == null) {
            return 0;
        } else if (n.getLeft() == null && n.getRight() == null) {
            return 1;
        }
        return countLeaves(n.getLeft()) + countLeaves(n.getRight());
    }

    public boolean isfull() {
        return isfull(root);
    }

    private boolean isfull(NodeBT<E> n) {
        if (n == null) {
            return true;
        } else if ((n.getLeft() == null && n.getRight() != null) || (n.getLeft() != null && n.getRight() == null)) {
            return false;
        }
        return isfull(n.getLeft()) && isfull(n.getRight()) && (height(n.getLeft()) == height(n.getRight()));
    }

    public int height() {
        return height(root);
    }

    private int height(NodeBT<E> n) {
        if (n == null) {
            return 0;
        }
        return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(NodeBT<E> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(NodeBT<E> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(NodeBT<E> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public boolean testBST() {
        return testBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE); //checks with numbers
    }

    private boolean testBST(NodeBT<E> node,int min,int max) {
        if(node == null) return true;
        if ((Integer)node.getData() < min || (Integer)node.getData() > max)//checks if it can be clasified as BST
            return false; 
 
        return (testBST(node.getLeft(), min, (Integer)node.getData() - 1) &&  testBST(node.getRight(), (Integer)node.getData()+1, max)); 
        //checks recursively so the left part is always less than the right part of the tree
    }
}

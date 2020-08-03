/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author CltControl
 */
public class BT<E> {

    private NodeBT<E> root;

    public BT() {
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

    public NodeBT<E> preOrderNext(E element) {
        if (element == null) {
            return null;
        }
        LinkedList<NodeBT<E>> l = new LinkedList<>();
        preOrderNext(root, l); //adds all nodes into the linkedList postOrder
        NodeBT<E> n = SearchNode(element);
        boolean nextNode = false;
        for (NodeBT<E> node : l) {
            if (nextNode == true) {
                nextNode = false;
                return node; //return if next  == true

            }
            if (node == n) {
                nextNode = true; //checks fot the next node
            }

        }
        return null;
    }

    private void preOrderNext(NodeBT<E> node, LinkedList<NodeBT<E>> l) {
        if (node != null) {
            l.add(node);
            preOrderNext(node.getLeft(), l);
            preOrderNext(node.getRight(), l);
        }
    }

    public NodeBT<E> inOrderNext(E element) {
        if (element == null) {
            return null;
        }
        LinkedList<NodeBT<E>> l = new LinkedList<>();
        inOrderNext(root, l); //adds all nodes to the linkedlist in inOrder
        NodeBT<E> n = SearchNode(element);
        
        boolean nextNode = false;
        for (NodeBT<E> node : l) {
            if (nextNode == true) {
                nextNode = false;
                return node; //returns next node
                
            }
            if (node == n) {
                nextNode = true;
            } //sets nextnode to True

        }
        return null;
    }

    private void inOrderNext(NodeBT<E> node, LinkedList<NodeBT<E>> l) {
        if (node != null) {
            inOrderNext(node.getLeft(),l);
            l.add(node);
            inOrderNext(node.getRight(),l);
        } //inOrder
    }

    public NodeBT<E> postOrderNext(E element) {
        if (element == null) {
            return null;
        }
        Stack<NodeBT<E>> s1 = new Stack<>();
        Stack<NodeBT<E>> s2 = new Stack<>();

        if (root == null || element == root.getData()) {
            return null;
        }
        // push root to first stack 
        s1.push(root);
        // Run while first stack is not empty 
        while (!s1.isEmpty()) {
            // Pop an item from s1 and push it to s2 
            NodeBT<E> temp = s1.pop();
            s2.push(temp);

            // Push left and right children of 
            // removed item to s1 
            if (temp.getLeft() != null) {
                s1.push(temp.getLeft());
            }
            if (temp.getRight() != null) {
                s1.push(temp.getRight());
            }
        }
        // Print all elements of second stack 
        while (!s2.isEmpty()) {
            if (s2.peek().getData() == element) {
                s2.pop();
                return s2.pop(); //returns nextnode
            }
            s2.pop();

        }
        return null;
    }

}

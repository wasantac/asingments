/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabeledBT;

import java.util.LinkedList;

/**
 *
 * @author walte
 */
public class LabeledBT<E> extends BT<E> {

    public LabeledBT() {
    }

    public void PreOrderNumber() {
        LinkedList<NodeBT<E>> l = new LinkedList<>();
        preOrderNumber(this.getRoot(), l);
        int count = 1;
        for (NodeBT<E> n : l) {
            n.setPreOrder(count);
            count++;
        }
        
        //sets the index of preOrder
    }

    private void preOrderNumber(NodeBT<E> node, LinkedList<NodeBT<E>> l) {
        //checks the tree in preOrder and adds element to the list
        if (node != null) {
            if (!l.contains(node)) {
                l.add(node);
            }
            preOrderNumber(node.getLeft(), l);
            preOrderNumber(node.getRight(), l);
        }

    }

    public void inOrderNumber() {
        LinkedList<NodeBT<E>> l = new LinkedList<>();
        inOrderNumber(this.getRoot(), l);
        int count = 1;
        for (NodeBT<E> n : l) {
            n.setInOrder(count);
            count++;
        }
        //sets the index of inOrder
    }

    private void inOrderNumber(NodeBT<E> node, LinkedList<NodeBT<E>> l) {
        //checks the tree in inOrder and adds element to the list
        if (node != null) {
            inOrderNumber(node.getLeft(), l);
            l.add(node);
            inOrderNumber(node.getRight(), l);
        }
        

    }

    public void postOrderNumber() {
        LinkedList<NodeBT<E>> l = new LinkedList<>();
        postOrderNumber(this.getRoot(), l);
        int count = 1;
        for (NodeBT<E> n : l) {
            n.setPostOrder(count);
            count++;
        }
        //sets the index of postOrder
    }

    private void postOrderNumber(NodeBT<E> node, LinkedList<NodeBT<E>> l) {
        //checks the tree in postOrder and adds element to the list
        if (node != null) {
            postOrderNumber(node.getLeft(), l);
            postOrderNumber(node.getRight(), l);
            l.add(node);
        }

    }

}

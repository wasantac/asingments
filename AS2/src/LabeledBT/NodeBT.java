/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabeledBT;


/**
 *
 * @author scarlet Espinoza
 */
public class NodeBT <E>{
    private E data;
    private NodeBT<E> left;
    private NodeBT<E> right;
    private int inOrder; //stores position for inorder
    private int preOrder; //stores position for preorder
    private int postOrder; //stores position for postorder
    public NodeBT(E data){
        this.data=data;
        left=right=null;
        
    }
    public int getInOrder() {
        return inOrder;
    }

    public void setInOrder(int inOrder) {
        this.inOrder = inOrder;
    }

    public int getPreOrder() {
        return preOrder;
    }

    public void setPreOrder(int preOrder) {
        this.preOrder = preOrder;
    }

    public int getPostOrder() {
        return postOrder;
    }

    public void setPostOrder(int postOrder) {
        this.postOrder = postOrder;
    }

    public E getData() {
        return data;
    }

    public NodeBT<E> getLeft() {
        return left;
    }

    public NodeBT<E> getRight() {
        return right;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setLeft(NodeBT<E> left) {
        this.left = left;
    }

    public void setRight(NodeBT<E> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return this.getData() +":{" + "inOrder=" + inOrder + ", preOrder=" + preOrder + ", postOrder=" + postOrder + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

/**
 *
 * @author scarlet Espinoza
 */
public class NodeBT <E>{
    private E data;
    private NodeBT<E> left;
    private NodeBT<E> right;
    
    public NodeBT(E data){
        this.data=data;
        left=right=null;
        
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
        return data.toString();
    }
    
    
}

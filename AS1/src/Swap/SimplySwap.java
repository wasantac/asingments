/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swap;

import SimpleNode.Node;
import firstassignment.List;

/**
 *
 * @author walte
 */
public class SimplySwap<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public SimplySwap() {
        first = last = null;
        size = 0;
    }

    @Override
    public boolean addFirst(E element) {
        Node<E> node = new Node<>(element);
        if (element == null) {
            return false;
        } else if (isEmpty()) {
            first = last = node;
        } else {
            node.setNext(first);
            first = node;
        }
        size++;
        return true;
    }

    private Node<E> getPrevious(Node<E> p) {
        if (p == first) {
            return null;
        }
        for (Node<E> q = this.first; q != null; q = q.getNext()) {
            if (q.getNext() == p) {
                return q;
            }
        }
        return null;
    }

    @Override
    public boolean addLast(E element) {
        Node<E> node = new Node<>(element);
        if (element == null) {
            return false;
        } else if (isEmpty()) {
            first = last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean removeFirst() {
        if (isEmpty()) {
            return false;
        } else if (first == last) {
            first = last = null;
        } else {
            first.setData(null);
            first = first.getNext();
        }
        size--;
        return true;
    }

    @Override
    public boolean removeLast() {
        if (isEmpty()) {
            return false;
        } else if (first == last) {
            first.setData(null);
            first = last = null;
        } else {
            last.setData(null);
            last = getPrevious(last);
            last.setNext(null);
        }
        size--;
        return true;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return first.getData();
        }
    }

    @Override
    public E getLast() {
        if (isEmpty()) {
            return null;
        } else {
            return last.getData();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E element) {
        if (isEmpty()) {
            return false;
        }
        if (first.getData().equals((element)) || last.getData().equals(element)) {
            return true;
        } else {
            for (Node<E> q = this.first; q != null; q = q.getNext()) {
                if (q.getData().equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean set(int index, E element) {
        if (element == null || index < 0 || index > size) {
            return false;
        }
        nodeIndex(index).setData(element);
        return true;
    }

    @Override
    public E get(int index) {
        if (isEmpty()) {
            return null;
        }
        Node<E> q = nodeIndex(index);
        return q.getData();
    }

    @Override
    public boolean isEmpty() {
        return first == null && last == null;
    }

    @Override
    public boolean insert(int index, E element) {
        if (index == 0) {
            return addFirst(element);
        } else if (element == null || index < 0 || index > size) {
            return false;
        } else {
            Node<E> q = nodeIndex(index - 1);
            Node<E> p = q.getNext();
            Node<E> node = new Node<>(element);
            q.setNext(node);
            node.setNext(p);
            size++;
            return true;
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        if (size == 1) {
            return "[" + first.getData() + "]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Node<E> q = this.first; q != null; q = q.getNext()) {
            sb.append(q.getData());
            sb.append(",");
        }
        String sb2 = sb.substring(0, sb.length() - 1);
        sb2 = sb2 + "]";
        return sb2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SimplySwap)) {
            return false;
        }
        SimplySwap<E> other = (SimplySwap<E>) obj;
        if (this.size != other.size) {
            return false;
        }
        Node<E> p = other.first;
        for (Node<E> q = this.first; q != null; q = q.getNext()) {
            if (!q.equals(p)) {
                return false;
            }
            p = p.getNext();
        }
        return true;
    }

    private Node<E> nodeIndex(int index) {
        Node<E> q = this.first;
        int cont = 0;
        while (index != cont) {
            q = q.getNext();
            cont++;
        }
        return q;
    }

    //Question 2A
    public boolean swap(E element) {
        if (element == null || size == 1) { //case where there is only one element
            return false;
        }
        if (element == this.last.getData()) { //if it is the last itme it will swap with the previos to the last
            element = nodeIndex(size - 2).getData();
        } else if (size == 2) {
            Node<E> tmp = first;
            last.setNext(tmp);
            tmp.setNext(null);
            first = last;
            last = tmp; //swaps first with last
        } else if (element == this.first.getData()) { //case when the element is the first item
            Node<E> A = nodeIndex(0);
            Node<E> B = A.getNext();
            A.setNext(B.getNext());
            B.setNext(A);
            this.first = B;  //swaps the first element with the second element
        } else { //other cases
            Node<E> A2 = first;
            int cont = 0;
            while (A2.getNext() != null || A2.getNext().getNext() != null) { //searches for the element
                if (A2.getData() == element) { //The order of the nodes is A1 - A2 - B1 - B2
                    Node<E> A1 = nodeIndex(cont - 1);
                    A2 = A1.getNext();
                    Node<E> B1 = A2.getNext();
                    Node<E> B2 = B1.getNext();
                    A1.setNext(B1);
                    A2.setNext(B2);
                    B1.setNext(A2);
                    return true;
                }
                A2 = A2.getNext();
                cont++;
            }
        }
        return true;
    }
}

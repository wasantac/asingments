/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleNode;

import firstassignment.List;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Walte
 */
public class DoblyLinkedList<E> implements List<E>, Iterable<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public DoblyLinkedList() {
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
            first.setPrevious(node);
            first = node;
        }
        size++;
        return true;
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
            node.setPrevious(last);
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
            first.getNext().setPrevious(null);
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
            last = last.getPrevious();
            last.getNext().setPrevious(null);
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
            node.setPrevious(q);
            node.setNext(p);
            p.setPrevious(node);
            size++;
            return true;
        }
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
        if (obj == null || !(obj instanceof DoblyLinkedList)) {
            return false;
        }
        DoblyLinkedList<E> other = (DoblyLinkedList<E>) obj;
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

    @Override
    public Iterator<E> iterator() {
        if (isEmpty()) {
            return null;
        }
        Iterator<E> it = new Iterator<E>() {
            private Node<E> p = first;

            @Override
            public boolean hasNext() {
                return p != null;
            }

            @Override
            public E next() {
                E tmp = p.getData();
                p = p.getNext();
                return tmp;
            }
        };
        return it;
    }

    public DoblyLinkedList<E> reverse() {
        return reverse(this);
    }

    //Question 5
    private DoblyLinkedList<E> reverse(DoblyLinkedList<E> dobly) { //reverse
        if (dobly.isEmpty()) { //checks first if the LinkedList is empty
            return null;
        }
        DoblyLinkedList<E> reversed = new DoblyLinkedList<>(); //Creates the new list
        Node<E> lastNode = dobly.last; //stores the last node element

        while (lastNode != null) { //loops until the pointer hits null
            /*
            that means that it has reached all the items
             */
            reversed.addLast(lastNode.getData());
            lastNode = lastNode.getPrevious();
        }

        return reversed;
    }


}

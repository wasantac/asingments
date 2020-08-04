/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author walte
 * @param <E>
 */
public class MyStack<E> {
    //Exercise 1
    private Queue<E> q1; //Queue 1
    private Queue<E> q2; //Queue 2
    private E head;
    
    public MyStack() { //Constructor of Stack
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }
    
    public boolean push(E element){ //push elements into the stack
        if (element == null) return false; //checks if there is a value
        q1.add(element); // adds the element to the Queue #1
        head = element; //sets the head of the element (the item on the top)
        return true;
    }
    
    public boolean pop(){ //removes the last element that was added (last in - first out)
        if(q1.isEmpty()) return false; //checks if we can remove any item
        while(q1.size() > 1){ 
            head = q1.remove();
            q2.add(head);
        } 
        /*
        This will add all the items to the second queue so it can store them
        and the last item that is left is the last item we pushed in
        */
        q1.remove(); //removes the last item
        Queue<E> temp = q1; //temp is a temporal empty queue
        q1 = q2; //sets q1 to q2 so we can recover the items
        q2 = temp; //sets q2 to an empty queue
        return true;
    }
    
    public boolean isEmpty(){ //checks if the stack is empty
        return q1.isEmpty();
    }

    public E getHead() {
        return head;
    }

    public void setHead(E head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return q1.toString();
    }
    
    public int size(){
        return q1.size();
    }
    
}

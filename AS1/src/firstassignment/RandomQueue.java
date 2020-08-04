/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;


import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author walte
 */
//Exercise 4
public class RandomQueue<E> {

    private ArrayList<E> arr;
    
    public RandomQueue() {
        arr = new ArrayList<>(); //Creates the Queue
    }

    public boolean add(E element) { //adds an element to the Queue
        if (element == null) {
            return false;
        }
        arr.add(element);
        return true;
    }

    public E remove() { //Removes random element form the Queue
        if(arr.isEmpty()) return null;
        int number = random(arr.size());
        E item = arr.get(number);
        arr.remove(number);
        return item;
    }

    private int random(int max){ //Generates random number 
        Random rand = new Random();
        int rd = rand.nextInt(max) ;   
        return rd;
    }
    
    public int size(){ //Returns the size of the Queue
        return arr.size();
    }

    @Override
    public String toString() {
        return arr.toString();
    }

}

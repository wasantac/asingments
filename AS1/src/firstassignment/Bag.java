/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author walte
 */
public class Bag<E> implements Uset<E> {
    private ArrayList<E> values; //sets the values
    private ArrayList<Integer> count; //counts how many of them are
    /*
    Its an implementation of a set so there is no repetition of the data within the set
    */
    public Bag() {
        this.values = new ArrayList<>();
        this.count = new ArrayList<>();
    }
    
    
    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean add(E element) {
        if(element == null) return false;
        if(values.isEmpty()){
            values.add(element); //adds the element if empty
        }
        else if(values.contains(element)){ //checks if there exists that element
            int index = values.indexOf(element);
            count.set(index, count.get(index)+1); //set count higher if the element exists
        }
        else{
            values.add(element);
            count.add(1);//if the element doesnt exist adds it to the set and sets the count to 1
        }
        return true;
    }

    @Override
    public E remove(E element) {
        if(element == null || !values.contains(element)) return null; //checks if the element exists
        int index = values.indexOf(element);
        if(count.get(index) > 1){ //if the count is greater to 1 then it will substract 1
            count.set(index, count.get(index)-1);
            return element;
        }
        else{
            count.remove(index); //remove the item if the cout is 1
            values.remove(index);
            return element;
        }
        
    }

    @Override
    public E find(E element) {
        if(!values.contains(element) || element == null) return null; //checks if the element exsists
        return element;
    }

    @Override
    public void clear() {
        values.clear();
        count.clear();
    }

    @Override
    public Iterator<E> iterator() {
        if(values.isEmpty()) return null;
        return values.iterator();
    }

    @Override
    public String toString() {
        return values.toString();
    }
    
    public ArrayList<E> findAll(E element){ //returns an array with the repeated elements
        ArrayList<E> arr = new ArrayList<>();
        if(!values.contains(element)) return null;
        int index = values.indexOf(element);
        for(int i = 0;i < count.get(index);i++){
            arr.add(element);
        }
        return arr;
    }
}

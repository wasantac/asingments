/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author walte
 */
public class HashModTN {

    private int[] arr;
    private int capacity = 10;
    private int size = 0;

    public HashModTN() {
        arr = new int[this.capacity];
    }

    public void insert(int i) {
        try {
            int kmod = i % 13;
            if (kmod >= capacity) {
                addCapacity();
            }
            arr[i % 13] = i;
            size++;
        } catch (NullPointerException ex) {

        }
        //inserts in position k mod 13
    }

    public boolean remove(int i) {
        try {
            int kmod = i % 13;
            if (kmod < capacity && arr[kmod] == i && !isEmpty()) {
                arr[kmod] = 0;
                size--;
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException ex) {
            return false;
        }
        
        //removes in position k mod 13
    }

    public void clear() {
        arr = new int[this.capacity];
        //clears array
    }

    public boolean contains(int i) {
        try{
            int knod = i % 13;
            return arr[knod] == i && !isEmpty();
        }catch(NullPointerException ex){
            return false;
        }
        
        //checks if it contains the number
    }



    public int get(int i) {
        try{
            int kmod = i %13;
            return arr[kmod];
        }catch(NullPointerException ex){
            return 0;
        }
        
        //gets the number at k mod 13
    }

    private void addCapacity() {
        int[] tmp = new int[capacity + (capacity / 2) * 3];
        for (int i = 0; i < capacity; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
        capacity = (capacity * 2) / 3;
        //adds more space with shallow copy
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < capacity; i++) {

            sb.append(arr[i]).append(",");

        }
        String sb2 = sb.substring(0, sb.length() - 1);
        String sb3 = sb2 + "]";

        return sb3;
    }

}

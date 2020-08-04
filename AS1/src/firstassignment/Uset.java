/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

/**
 *
 * @author walte
 */
public interface Uset<E> extends Iterable<E> {
    public int size();
    public boolean add(E element);
    public E remove(E element);
    public E find(E element);
    public void clear();
}

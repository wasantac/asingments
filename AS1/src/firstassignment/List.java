/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

/**
 *
 * @author CltControl
 */
public interface List<E> {

    boolean addFirst(E element);

    boolean addLast(E element);

    boolean removeFirst();

    boolean removeLast();

    E getFirst();

    E getLast();

    int size();

    boolean contains(E element);

    boolean set(int index, E element);

    E get(int index);

    boolean isEmpty();

    boolean insert(int index, E element);
}

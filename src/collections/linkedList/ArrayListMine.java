package collections.linkedList;

import java.util.Arrays;

/**
 * Created by ddimmxxgmail.com on 3/20/17.
 */
public class ArrayListMine <E> implements List <E> {


    final static int DEFAULT_CAPACITY = 10;
    E [] elementData;
    int size = 0;


    public ArrayListMine (int length){
        elementData = (E[]) new Object [length];
    }

    public ArrayListMine (){
        this(DEFAULT_CAPACITY);
    }








    @Override
    public void add(E element) {
        elementData[size] = element;



    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public void addAll(List<? extends E> collection) {

    }

    @Override
    public void addAll(int index, List<? extends E> collection) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public List<E> subList(int indexFrom, int indexTo) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }

    public void printToString(){
        System.out.println(Arrays.toString(elementData));

    }

}

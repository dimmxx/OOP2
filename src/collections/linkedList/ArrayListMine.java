package collections.linkedList;

import java.util.Arrays;

/**
 * Created by ddimmxxgmail.com on 3/20/17.
 */
public class ArrayListMine <E> implements List <E> {

    final static int DEFAULT_CAPACITY = 3;
    E [] elementData;
    int size = 0;
    int remove = 0;

    public ArrayListMine (int length){
        elementData = (E[]) new Object [length];
    }

    public ArrayListMine (){
        this(DEFAULT_CAPACITY);
    }

    public void arrayCopy (int newSize){
        E [] elementDataNew = (E[]) new Object [newSize];
        for (int i = 0; i < size; i++){
            elementDataNew[i] = elementData[i];
        }
        elementData = elementDataNew;
    }

    public void ensureCapacity (){
        if (size < elementData.length) return;
        if (size == elementData.length) arrayCopy(size + 3);
    }

    public void trimSize (){
        if (elementData.length > size + 9){
            arrayCopy(size + 3);
        }

    }

    @Override
    public void add(E element) {
        ensureCapacity();
        elementData[size] = element;
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index >= elementData.length)
            throw new ArrayIndexOutOfBoundsException("Out of array bounds");
        ensureCapacity();
        if (index <= size) {
            for (int i = size; i > index; i--) {
                elementData[i] = elementData[i - 1];
            }
            elementData[index] = element;
        }

        if (index == elementData.length - 1) {
            elementData[size] = element;
        }
        size++;

    }

    @Override
    public void addAll(List<? extends E> collection) {

    }

    @Override
    public void addAll(int index, List<? extends E> collection) {

    }

    @Override
    public E get(int index) {
        return elementData[index];
    }

    @Override
    public E set(int index, E element) {
        elementData[index] = element;
        return elementData[index];
    }

    @Override
    public E remove(int index) {
        if(index >= size) throw new ArrayIndexOutOfBoundsException("Wrong index");
        trimSize();
        E tmp = elementData[index];
        for (int i = index; i < size - 1; i++){
            elementData[i] = elementData[i + 1];
        }
        elementData[size - 1] = null;
        size--;
        return tmp;

    }

    @Override
    public List<E> subList(int indexFrom, int indexTo) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }

    @Override
    public int size() {
        return size;
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
        for (int i = size; i > 1; i--){
            elementData[i] = null;
            size--;
        }
        remove(0);

    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }

    public void printToString(){
        System.out.println(Arrays.toString(elementData) + " Size: " + size
                                                        + " length: " + elementData.length);

    }

}

package collections.linkedList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ddimmxxgmail.com on 3/20/17.
 */
public class ArrayListMine <E> implements List <E> {

    final static int DEFAULT_CAPACITY = 3;
    E [] elementData;
    int size = 0;

    public ArrayListMine (int length){
        elementData = (E[]) new Object [length];
    }

    public ArrayListMine (){
        this(DEFAULT_CAPACITY);
    }

    public void arrayCopy (int newLength){
        E [] elementDataNew = (E[]) new Object [newLength];
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
    public void addAll(java.util.List<? extends E> collection) {
        if (elementData.length - size < collection.size()){
            arrayCopy(size + collection.size());
        }
        for (int i = size; i < elementData.length; i++){
            elementData[i] = collection.get(i - size);
        }
        size += collection.size();
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
    public java.util.List<E> subList(int indexFrom, int indexTo) {
        if (indexFrom < 0 || indexTo < 0) throw new ArrayIndexOutOfBoundsException("Wrong index");
        if (indexFrom > elementData.length - 1 || indexTo > elementData.length - 1) throw new ArrayIndexOutOfBoundsException("Wrong index");
        ArrayList <E> tmpArrayList = new ArrayList<E>();
        for (int i = indexFrom ; i <= indexTo; i++){
            tmpArrayList.add(elementData[i]);
        }
        return tmpArrayList;
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
        for (int i = 0; i < size; i++){
            if (elementData[i] == element) return i;
        }
        return -1;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++){
            if (elementData[i] == element) return true;
        }
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
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elementData.length; i++){
            sb.append(i == elementData.length - 1 ? elementData[i] : elementData[i] + ", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public void printToString(){
        System.out.println(Arrays.toString(elementData) + " Size: " + size
                                                        + " length: " + elementData.length);

    }

}

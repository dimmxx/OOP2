package collections.linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by ddimmxxgmail.com on 3/12/17.
 */
public class LinkedList <E> implements List <E>,  Iterable {

    @Override
    public Iterator iterator() {
        Iterator iter = new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }
            @Override
            public E next() {
                return null;
            }
        };

        return iter;
    }


    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }











    private class Node <E>{
        private E element;
        private Node <E> next;
        private Node  <E> prev;

        public Node(E element) {
            this.element = element;
        }
    }

    private Node<E> first;
    private Node <E> last;
    private int size = 0;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node <E> current = first;
        for (int i = size; i > 0; i--){
            sb.append(current.next != null ? current.element + ", " : current.element );
            current = current.next;
        }
        sb.append("]");
        sb.append(" - size is " + size);
        return sb.toString();
    }

    public String toStringHT (){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node <E> current = first;
        do{
            sb.append(current.element + ", ");
            current = current.next;
        }while (current != last);
        sb.append(current.element + "]");
        sb.append(" - size is " + size);
        return sb.toString();
    }

    public void add() {
        Node <E> nd = new Node<E>(null);
        if (first == null) first = last = nd;
        else {
            nd.prev = last;
            last.next = nd;
            last = nd;
        }
        size++;
    }

    @Override
    public void add(E element) {

        Node <E> nd = new Node<E>(element);
        if (first == null) first = last = nd;
        else {
            nd.prev = last;
            last.next = nd;
            last = nd;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (size == 0 & index == 1) {
            add(element);
            return;
        }
        Node<E> current = getPos(index);
        Node<E> nd = new Node<E>(element);
        nd.next = current;
        nd.prev = current.prev;
        if (index != 1) current.prev.next = nd;
        if (index == 1) first = nd;
        current.prev = nd;
        size++;
//            System.out.println(size);
//            System.out.println(current.element);

    }

    @Override
    public void addAll(java.util.List<? extends E> collection) {

    }

    @Override
    public void addAll(int index, List<? extends E> collection) {

    }

    public Node <E> getPos (int index) {
        if (index <= 0 || index > size) throw new IndexOutOfBoundsException("Wrong index");
        Node<E> pos = null;
        if (size / 2 > index) { //  начинаем с начала
            pos = first;
            for (int i = 0; i < index - 1; i++) {
                pos = pos.next;
            }
        } else {
            pos = last;
            for (int i = size; i > index; i--) {
                pos = pos.prev;
            }
        }
        return pos;
    }

    @Override
    public E get(int index) {
        Node <E> current = getPos(index);
        return current.element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> current = getPos(index);
        E tmp = current.element;
        current.element = element;
        return tmp;
    }

    @Override
    public E remove(int index) {
        Node <E> current = getPos(index);
        E tmp = current.element;
        if (index == 1) {
            current.next.prev = null;
            first = current.next;
            size--;
            return current.element;
        }
        if (index == size){
            current.prev.next = null;
            last = current.prev;
            current.prev = null;
            size--;
            return current.element;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        return current.element;
    }

    public void subListHT(int indexFrom, int indexTo) {
        Node<E> currentF = getPos(indexFrom);
        Node <E> currentL = getPos(indexTo);
        Node <E> tmpF = first;
        Node <E> tmpL = last;
        first = currentF;
        last = currentL;
        System.out.println(toStringHT());
        first = tmpF;
        last = tmpL;
    }

    @Override
    public java.util.List subList(int indexFrom, int indexTo) {
        List <E> ls = new LinkedList<E>();

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
        Node<E> current = first;
        int i = 1;
        do{
            if (element == current.element) return i;
            current = current.next;
            i++;
        } while (i <= size);
        return 0;
    }

    @Override
    public boolean contains(E element) {
       if(indexOf(element) == 0) return false;
       return true;
    }

    @Override
    public void clear() {
        first = last = null;
        size = 0;

    }
}

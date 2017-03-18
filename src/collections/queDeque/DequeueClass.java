package collections.queDeque;

import javax.jnlp.IntegrationService;
import java.util.NoSuchElementException;

/**
 * Created by ddimmxxgmail.com on 3/10/17.
 */
public class DequeueClass <E> implements Dequeue <E> {

    NodeDequeue <E> head;
    NodeDequeue <E> tail;
    int size = 0;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        NodeDequeue current = head;
        for (int i = size; i > 0; i--){
            sb.append(current.getNext() != null ? current.getEl() + ", " : current.getEl() );
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean offer(E element) {
        if (element == null) return false;
        NodeDequeue nd = new NodeDequeue(element);
        if (head == null){
            head = tail = nd;
        } else {
            tail.setNext(nd);
            nd.setPrev(tail);
            tail = nd;
        }
        size++;
        return true;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public void addFirst(E element) {
        if (element == null) throw new NoSuchElementException("Element can not be NULL");
        NodeDequeue nd = new NodeDequeue(element);
        if (head == null) head = tail = nd;
        else {
            head.setPrev(nd);
            nd.setNext(head);
            head = nd;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        if (element == null) throw new NoSuchElementException("Element can not be NULL");
        NodeDequeue nd = new NodeDequeue(element);
        if (head == null){
            head = nd;
            tail = nd;
        } else {
            tail.setNext(nd);
            nd.setPrev(tail);
            tail = nd;
        }
        size++;
    }

    @Override
    public boolean offerFirst(E element) {
        return false;
    }

    @Override
    public boolean offerLast(E element) {
        return false;
    }
    
    @Override
    public E peekFirst() {
        if (head == null) return null;
        return (E)head.getEl();
    }

    @Override
    public E peekLast() {
        if (tail == null) return null;
        return (E)tail.getEl();
    }

    @Override
    public E pollFirst() {
        if (size == 0) throw new NoSuchElementException("No nodes to delete. Size is " + size);
        E val = (E)head.getEl();
        if (size != 1) {
            head = head.getNext();
            head.setPrev(null);
        } else {
            head = tail =null;
        }
        size--;
        return val;
    }

    @Override
    public E pollLast() {
        if (size == 0) throw new NoSuchElementException("No nodes to delete. Size is " + size);
        E val = (E)tail.getEl();
        if (size != 1) {
            tail = tail.getPrev();
            tail.setNext(null) ;
            size--;
        } else {
            //tail = head;
            //tail.setNext(null);
            size--;
            head = tail = null;
        }
        return val;
    }
}

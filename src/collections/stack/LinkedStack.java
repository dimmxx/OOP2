/**
package collections.stack;

import lesson8.NestedInnerClasses;

/**
 * Created by ddimmxxgmail.com on 2/26/17.

public class LinkedStack implements Stack {

    private class Node{
        Integer element;
        Node next;

        public Node(Integer el){
            this.element = el;
        }

        public Node(Integer el, Node next){
            this(el);
            this.next = next;

        }
    }

    int elementCount;
    Node head;


    @Override
    public boolean push(Integer el) {
       Node nd = new Node(el);
       if (head == null){
           head = nd;}
           else {
               nd.next = head;
               head = nd;
           }


        return false;
    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Integer peak() {
        return null;
    }
    @Override
    public boolean search(Integer el) {
        return false;
    }
}
*/
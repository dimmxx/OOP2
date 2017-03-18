package collections.queDeque;

/**
 * Created by ddimmxxgmail.com on 3/4/17.
 */
public class LinkedQueue extends AbstractQueue implements Queue {

    private class Node {
        Node link;
        Integer el;

        public Node(int el) {
            this(null, el);
        }

        public Node(Node link, int el) {
            this.link = link;
            this.el = el;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;


    @Override
    public boolean add(Integer el) {
        if (el == null) return false;

        Node nd = new Node(el);
        if (head == null) {
            head = nd;
            tail = nd;

        }
        else {
            System.out.println(head.el + " head");
            System.out.println(tail.el + " tail");
            tail.link = nd;
            tail = nd;
            System.out.println(tail.el);
        }
        System.out.println(head.el + " " + tail.el);
        size++;
        return true;
    }


    @Override
    public String toString() {
        System.out.println("Size " + size);
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        Node tmp = head;

        for (int i = size; size > 0; size--){
            sb.append(tmp.link != null ? tmp.el + ", " : tmp.el);
            tmp = tmp.link;
        }

        sb.append("]");
        return sb.toString();
    }





    @Override
    public boolean offer(Integer el) {
        return false;
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer element() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void addAll(Queue q) {

    }

    @Override
    public void remove(Queue q) {

    }

}



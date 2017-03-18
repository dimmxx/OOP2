package collections.queDeque;

/**
 * Created by ddimmxxgmail.com on 3/10/17.
 */
public class NodeDequeue <E> {

    private E el;
    private NodeDequeue prev;
    private NodeDequeue next;

    public NodeDequeue (NodeDequeue prev, NodeDequeue next, E el){
        this.prev = prev;
        this.next = next;
        this.el = el;
    }

    public NodeDequeue (E el){
        this (null, null, el);
    }


    public NodeDequeue getPrev() {
        return prev;
    }

    public NodeDequeue getNext() {
        return next;
    }

    public E getEl(){
        return el;
    }

    public void setPrev(NodeDequeue prev) {
        this.prev = prev;
    }

    public void setNext(NodeDequeue next) {
        this.next = next;
    }
}

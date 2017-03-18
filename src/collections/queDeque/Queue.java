package collections.queDeque;

/**
 * Created by ddimmxxgmail.com on 3/4/17.
 */
public interface Queue {

    boolean add (Integer el);
    boolean offer (Integer el);
    Integer remove ();
    Integer poll ();
    Integer element();
    Integer peek ();

    int size();
    boolean isEmpty();
    void clear();
    int[] toArray();

    void addAll(Queue q);
    void remove(Queue q);
}

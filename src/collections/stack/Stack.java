package collections.stack;

/**
 * Created by ddimmxxgmail.com on 2/26/17.
 */
public interface Stack <E>{


    boolean push(E el);

    E pop ();

    E peek ();

    boolean isEmpty();

    boolean isFull();

    int size();

    boolean search (E el);

}

package collections.linkedList;

/**
 * Created by ddimmxxgmail.com on 3/12/17.
 */
public interface List <E> {


    void add(E element);

    void add(int index, E element);

    void addAll(java.util.List<? extends E> collection);

    void addAll(int index, List <? extends E> collection);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    java.util.List subList(int indexFrom, int indexTo);

    boolean isEmpty();

    int size();

    int indexOf(E element);

    boolean contains(E element);

    void clear();

}

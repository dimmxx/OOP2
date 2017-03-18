package collections.queDeque;

/**
 * Created by ddimmxxgmail.com on 3/4/17.
 */
public abstract class AbstractQueue implements Queue {

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}

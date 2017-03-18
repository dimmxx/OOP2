package collections.queDeque;

/**
 * Created by ddimmxxgmail.com on 3/8/17.
 */
public class LinkedQueueDemo {

    public static void main (String [] args){


        LinkedQueue lq = new LinkedQueue();


        lq.add(5);
        lq.add(7);
        lq.add(99);

        System.out.println(lq.toString());

    }
}

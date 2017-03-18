package collections.queDeque;

/**
 * Created by ddimmxxgmail.com on 3/10/17.
 */
public class DequeueDemo {

    public static void main (String [] args){


        DequeueClass deq = new DequeueClass();

        deq.addFirst(-1);
        deq.addFirst(true);
       // deq.addLast(4);
        //deq.addLast(77);
//        deq.offer(4);
//        deq.offer(7);
//        deq.offer(9);
//        //deq.addLast(null);
//        //deq.addFirst(null);
//        deq.addLast(17);
//        deq.addFirst(1);
//        deq.addFirst(0);

        System.out.println(deq.toString());

        System.out.println(deq.pollLast());

        System.out.println(deq.toString());

        System.out.println(deq.pollLast());

        System.out.println(deq.toString());

       // System.out.println(deq.pollLast());

        deq.addLast(4);

        System.out.println(deq.toString());
        deq.addFirst("string");
        deq.offer(true);
        System.out.println(deq.toString());
        System.out.println(deq.pollLast());
        System.out.println(deq.pollLast());
        System.out.println(deq.toString());
        System.out.println(deq.pollLast());
        System.out.println(deq.toString());
        deq.addLast(1);
        System.out.println(deq.toString());
        System.out.println(deq.peekFirst());
        System.out.println(deq.peekLast());
        deq.pollLast();
        System.out.println(deq.toString());
        System.out.println(deq.peekFirst());
        deq.offer(true);
        System.out.println(deq.toString());
        System.out.println(deq.peekFirst());
        System.out.println(deq.pollLast());
        System.out.println(deq.toString());
        System.out.println(deq.peekFirst());





    }

}

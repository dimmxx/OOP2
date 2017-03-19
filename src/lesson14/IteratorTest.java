package lesson14;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by ddimmxxgmail.com on 3/19/17.
 */
public class IteratorTest {


    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();


        list.add(5);
        list.add(6);
        list.add(55);
        list.add(45);
        list.add(85);
        list.add(21);
        list.add(52);
        list.add(5);


        System.out.println(list);

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if(iter.next() == 52) iter.remove();
         System.out.print(iter.next() + " ");

        }
    }



}

package collections.linkedList;

import java.util.Iterator;

/**
 * Created by ddimmxxgmail.com on 3/12/17.
 */
public class LinkedListDemo {


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();


        System.out.println(ll.isEmpty());
        ll.add(1, 10);
        ll.add();
        System.out.println(ll.size());
        System.out.println(ll.isEmpty());
        System.out.println(ll.get(1));
        ll.set(2, true);

        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(15);
        ll.add(16);
        ll.add(20);
        ll.add(21);
        ll.add(122);
        ll.subListHT(2, 7);
//
//
//       ll.add(1,77);
//       ll.add(3);
//       ll.add(10, 1);
//       ll.add(1,true);
//       ll.remove(1);
//       ll.remove(1);
//       ll.remove(900);


       //ll.add(-10, 500);
//     ll.add(11, 501);

        System.out.println(ll.toString());
        ll.subListHT(1, 10);
        ll.add(2,false);
        System.out.println(ll.toString());

        System.out.println(ll.indexOf(100));
        System.out.println(ll.contains(50));
        //ll.clear();
        System.out.println(ll.toString());
        System.out.println(ll.subList(2,10));












        }


    }





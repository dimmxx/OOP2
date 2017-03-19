package lesson14;

import collections.linkedList.LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by ddimmxxgmail.com on 3/19/17.
 */
public class ComparatorTest {

    public static void main(String[] args) {

        User user = new User("Ivanov", 25);
        User user2 = new User("Petrov", 17);
        User user3 = new User("Sidorov", 27);
        User user4 = new User("Petrenko", 25);
        User user5 = new User("Sidorenko", 46);
        User user6 = new User("Avishvili", 10);
        User user7 = new User("Avishvili", 11);
        User user8 = new User("Avishvili", 12);


        java.util.LinkedList <User> list = new java.util.LinkedList<>();
       // LinkedList<User> list = new LinkedList<>();
        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);

        //Collections.sort(list);

        System.out.println(list);

        //System.out.println(user.compareTo(user3));


        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }.thenComparing(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        }));

        System.out.println(list);

    }
}

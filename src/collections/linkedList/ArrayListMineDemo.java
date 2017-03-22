package collections.linkedList;

import java.util.ArrayList;

/**
 * Created by ddimmxxgmail.com on 3/21/17.
 */
public class ArrayListMineDemo {

    public static void main(String[] args) {

        ArrayListMine al = new ArrayListMine(3);




//        al.add(1);
//        al.add(2);
//        al.add(3);
//       // al.add(4);
//        al.printToString();
////       al.add(5);
////        al.add(6);
////        al.add(7);
////        al.add(8);
////        al.add(9);
////        al.add(10);
//    //  al.add(4, 555);
//        //al.printToString();
//        al.remove(0);
//        al.add(2, 777);
//        al.remove(0);
//        al.remove(1);
//        al.add(3);
//        al.add(4);
//        al.add(35);
//        al.remove(3);


       al.printToString();

       for (int i = 0; i < 100; i++){
           al.add((int)(Math.random()*100));

       }
       al.printToString();

        for (int i = 99; i > 10; i--){
            al.remove(i);
        }

        al.printToString();
        al.remove(0);
        al.printToString();
        al.clear();
        al.printToString();





    }


}
